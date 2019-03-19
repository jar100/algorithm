package programas.clear.gymsuit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GymSuit {
    /*
     * 그리드 이용
     * 그리드는 현재 상황에서 최적의 결과를 찾는 방법
     * lost = 옷을 도둑맞은 사람
     * reserve = 여벌의 옷을 갖은 사람
     *
     * 1. 그냥 n 으로 for 문을 돌리자.
     * 2. 옷을 빌려줄 수 있는 사람은 번호가 +1 -1 인 아이
     * 3. n 은 전체 사람수니 lost 와 reserve 의 length 를 빼주면 그냥 옷갖은 애
     *
     *
     * */
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int lostIndex = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());


        for (Iterator<Integer> it = reserveList.iterator(); it.hasNext(); ) {
            Integer value = it.next();

            if (lostList.contains(value)) {
                lostList.remove(value);
                it.remove();
            }
        }

        for (Integer integer : reserveList) {
            System.out.println(integer);
        }
        for (int i = 1; i <= n; i++) {
            if (i == lostList.get(lostIndex)) {
                for (int j = 0; j < reserveList.size(); j++) {
                    if (Math.abs(lostList.get(lostIndex) - reserveList.get(j)) < 1) {
                        reserveList.remove(j);
                        answer++;
                        break;
                    }
                }
                if (lostIndex < lostList.size() - 1) {
                    lostIndex++;
                }
            } else {
                answer++;
            }
        }

        return answer;
    }
}
