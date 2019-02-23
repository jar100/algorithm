package programas.clear.jobpare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JobPare2 {
    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people);
        Arrays.sort(tshirts);

        List<Integer> tshirtsList = Arrays.stream(tshirts).boxed().collect(Collectors.toList());
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < tshirtsList.size(); j++) {
                if (tshirtsList.get(j) >= people[i]) {
                    tshirtsList.set(j, 0);
                    answer++;
                    break;
                }
            }

        }

        return answer;
    }
}
