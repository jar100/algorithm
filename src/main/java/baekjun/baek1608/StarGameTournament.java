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

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] temp = bf.readLine().split(" ");
            players.add(new Player(i, temp));
        }

        // 플레이어 리스트를 만들었다.

        // 이제 각각의 플레이어 들이 우승 할 수 있는지 반환시켜야한다.


        // 절반 만큼만 비교
        // 절반의 경우를 다 따진다.





        for (int i = 1; i < nemesisCount.length; i++) {
            if (nemesisCount[i] <= (count / 2)) {
                answer.add(i);
            }
        }

        int[] answerArray = answer.stream().mapToInt(i -> i).toArray();
        System.out.println(show(answerArray));

    }

    static class  Player {
        int index;
        int[] nemesis;

        public Player(int a, String[] ints) {
            this.index = a;
            this.nemesis = new int[Integer.parseInt(ints[0])];
            for (int i = 0; i < nemesis.length; i++) {
                nemesis[i] = Integer.parseInt(ints[i + 1]);
            }
        }



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
