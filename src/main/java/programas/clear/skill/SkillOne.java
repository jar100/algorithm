package programas.clear.skill;

import java.util.Arrays;
/*
* 문제 요구조건
* 배열 d 에는 부서별로 필요한 금액이 적혀있다.
* budget 은 예산이다.
* 예산을 초과하지않고 가장 많은 부서에게 예산을 분배하여라
* 분배받은 부서의 최대 수를 구하여라.
*
* */
public class SkillOne {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget < temp + d[i]) {
                return answer;
            }
            answer ++;
            temp += d[i];
        }
        return answer;
    }
}
