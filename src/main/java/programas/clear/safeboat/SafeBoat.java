package programas.clear.safeboat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SafeBoat {
    public int solution(int[] people, int limit) {
        int answer = 1;
        int weight = 0;
        int count = 0;
        Arrays.sort(people);
        List<Integer> peoples = Arrays.stream(people).boxed().collect(Collectors.toList());

        while (!peoples.isEmpty()) {
            weight += peoples.get(peoples.size() - 1);
            if (weight <= limit && count < 2) {
                count++;
                if (weight + peoples.get(0) <= limit) {
                    count++;
                    peoples.remove(0);
                }
                if (!peoples.isEmpty()) {
                    peoples.remove(peoples.size() - 1);
                }

            } else {
                count = 0;
                weight = 0;
                answer++;

            }

        }


        return answer;
    }
}
