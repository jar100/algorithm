package baekjun.baek1608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StarGameTournament {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        int[] nemesisCount = new int[count + 1];

        List<Integer> answer = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            String[] temp = bf.readLine().split(" ");
            for (int j = 1; j < temp.length; j++) {
                int index = Integer.parseInt(temp[j]);
                nemesisCount[index]++;
            }
        }

        for (int i = 1; i < nemesisCount.length; i++) {
            if (nemesisCount[i] <= (count / 2)) {
                answer.add(i);
            }
        }
        int[] answerArray = answer.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(nemesisCount));

        System.out.println(answer);

        System.out.println(show(answerArray));

    }

    private static String show(int[] answerArray) {
        StringBuilder sb = new StringBuilder();
        sb.append(answerArray.length).append(" ");
        for (int i = 0; i < answerArray.length; i++) {
            sb.append(answerArray[i]);
            if (i != answerArray.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
