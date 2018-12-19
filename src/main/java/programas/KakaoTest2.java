package programas;

import java.util.*;
import java.util.stream.IntStream;

public class KakaoTest2 {

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        List<Integer> list = new ArrayList<>();

        Map<Integer,Double> map1 = new HashMap<>();
        for (int i = 1; i < N+1; i++) {
            int count = 0;
            int ofi = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    count ++;
                }
                if (stages[j] > i) {
                    ofi ++;
                }
            }
            map1.put(i,findfailed(count,ofi));
        }
        list = sortByValue(map1);
        System.out.println(list);

        for (int i=0; i < answer.length; i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
        //answer.size => 스테이지 개수
    }

    private static Double findfailed(int count, int ofi) {
        return (double)count/ofi;
    }
    // 1,2,3,4

    // 1 =1 ,  2 = 0.5
    public static List<Integer> sortByValue(Map<Integer,Double> map) {
        List<Integer> list = new ArrayList(map.keySet());
        list.sort( (o1, o2) -> {
            Double v1 = map.get(o1);
            Double v2 = map.get(o2);
            return (int)(v2-v1);
        });
        //Collections.reverse(list); // 주석시 오름차순
        return list;
    }


}
