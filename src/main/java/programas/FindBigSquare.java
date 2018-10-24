package programas;

import java.util.ArrayList;
import java.util.Arrays;

public class FindBigSquare {

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

    //findBigSquare
    public static int solution(int [][]board)
    {
        int answer = 1234;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }


}
