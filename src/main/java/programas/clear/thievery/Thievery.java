package programas.clear.thievery;

//프로그래머스 도둑질
public class Thievery {
    public int solution(int[] money) {
        int answer = 0;
        //첫번째 집부터 구하기
        int[] result = new int[money.length + 2];
        //두번째 집부터 구하기
        int[] result2 = new int[money.length + 2];

        //초기값 입력
        result[2] = money[0];
        result2[3] = money[1];

        //i를 증가 시키면서 money[i] 를 사용할 때 최고 값을 구한다.
        for (int i = 1; i < money.length; i++) {
            // dp
            //첫번째 집을 구할땐 마지막 집을 못 더한다.
            if (i < money.length - 1) {
                dp(money, result, i);
            }
            //두번째 집부터 구하려면 첫번째 집은 못 더한다.
            if (i > 1) {
                dp(money, result2, i);
            }
            //나온 결과 값들중 가장 큰값을 뽑는다.

            answer = findMax(answer, result[i + 2], result2[i + 2]);
        }

        return answer;
    }

    private int findMax(int answer, int result1, int result2) {
        int newResult = result1 > result2 ? result1 : result2;
        if (answer > newResult) {
            return answer;
        }
        return newResult;
    }

    private void dp(int[] money, int[] result, int i) {
        if (result[i] > result[i - 1]) {
            result[i + 2] = money[i] + result[i];
        } else {
            result[i + 2] = money[i] + result[i - 1];
        }
    }
}
