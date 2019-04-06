package programas;

import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class abc {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] answer = new int[alice.length];
        int[] rank = Arrays.stream(scores).distinct().toArray();

        int count = alice.length - 1;
        int scoreListSize = rank.length;
        int maxRank = rank[(scoreListSize - 1)];

        if (alice[count] < maxRank) {
            while(count == 0) {
                answer[count] = scoreListSize + 1;
                count --;
            }
        }

        for (int j = 0; j < scoreListSize; j++) {
            for (int i = count; i >= 0 ; i--) {
                if (alice[i] >= rank[j]) {
                    answer[i] = j +1;
                    count --;
                } else if(alice[i] < maxRank) {
                    answer[count] = scoreListSize + 1;                                                                          count --;
                } else {
                    break;
                }

            }

        }

        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        StringBuilder sb = new StringBuilder();





        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);




        for (int i = 0; i < result.length; i++) {
            sb.append(String.valueOf(result[i]));

            if (i != result.length - 1) {
                sb.append("\n");

            }
        }
        System.out.println(sb);

        scanner.close();
    }
}
