package programas;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaTest3 {

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
           if (i % divisor == 0) {
               result.add(i);
           }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
