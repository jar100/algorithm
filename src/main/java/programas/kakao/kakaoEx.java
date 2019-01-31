package programas.kakao;

import java.util.ArrayList;
import java.util.List;

public class kakaoEx {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];

        System.out.println("Hello Java");
        answer[0] = findXpoint(v);
        answer[1] = findYpoint(v);
        return answer;
    }


    public int findXpoint(int[][] v) {
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < v.length; i++){
            if (!a.contains(v[i][0])) {
                a.add(v[i][0]);
            } else {
                a.remove(a.indexOf(v[i][0]));
            }
        }
        return a.get(0);
    }

    public int findYpoint(int[][] v) {
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < v.length; i++){
            if (!a.contains(v[i][1])) {
                a.add(v[i][1]);
            } else {
                a.remove(a.indexOf(v[i][1]));

            }
        }
        return a.get(0);
    }

    public int[] solution2(int[][] v) {
            int[] answer = new int[2];
            int an = 5;

        System.out.println(String.format("%6s",Integer.toBinaryString(an)));
            for (int i = 0; i < v.length; i++) {
                answer[0] ^= v[i][0];
                System.out.println("asdfasdf" + answer[0]);
                System.out.println(Integer.toBinaryString(answer[0]));
                answer[1] ^= v[i][1];
            }

        return answer;
    }

}
