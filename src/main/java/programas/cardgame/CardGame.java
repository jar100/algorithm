package programas.cardgame;

import java.util.Arrays;

//프로그래머스 카드게임
//        dp[i][j] 이 위치로 올라면
//        선택할 수 있는경우 둘다 버린다. dp[i-1][j-1]
//        오른쪽만 버린다. dp[i][j-1] + R[j -1]
//        왼쪽만 버린다.  dp[i-1][j]
/*
* 역시 이것도 배열의 값을 기준으로 현상태에서 최대값을 이전값에서 산출 해논다.
* 그런식으로하고 마지막 값이 정다.ㅂ
*
*
* */
public class CardGame {
    public int solution(int[] left, int[] right) {
        int answer = 0;

        int[][] dp = new int[left.length + 1][right.length + 1];
        for (int i = 1; i < left.length + 1; i++) {
            for (int j = 1; j < right.length + 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                if (left[i - 1] > right[j - 1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + right[j - 1]);
                }
            }
        }

        /*for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }*/
        answer = dp[left.length][right.length];
        return answer;
    }
}
