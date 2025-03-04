package programas.clear.gymsuit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GymSuitTest {
    GymSuit gymSuit = new GymSuit();

    @Test
    public void name() {
        assertThat(gymSuit.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})).isEqualTo(5);
        assertThat(gymSuit.solution(5, new int[]{4, 2}, new int[]{3, 1, 5})).isEqualTo(5);
    }

    @Test
    public void name1() {
        assertThat(gymSuit.solution(5, new int[]{2, 4}, new int[]{3})).isEqualTo(4);
    }

    @Test
    public void name2() {
        assertThat(gymSuit.solution(3, new int[]{3}, new int[]{2})).isEqualTo(3);
    }

    @Test
    public void name3() {
        assertThat(gymSuit.solution(3, new int[]{1,3}, new int[]{2})).isEqualTo(2);
    }

    @Test
    public void name4() {
     /// n=5 / lost=[2, 3, 4] / reserve=[3, 4, 5] 로 런할 때, 답은 4인데 5가 나오지 않나요??
        assertThat(gymSuit.solution(5, new int[]{2,3,4}, new int[]{3,4,5})).isEqualTo(4);
    }


    @Test
    public void name5() {
        assertThat(gymSuit.solution(6, new int[]{1,3,5}, new int[]{3,4})).isEqualTo(5);
    }

    @Test
    public void name6() {
        // 12345678910
        assertThat(gymSuit.solution(5, new int[]{3,4}, new int[]{4,5})).isEqualTo(4);
    }

    @Test
    public void name7() {
        // 12345678910
        assertThat(gymSuit.solution(5, new int[]{3,4,5}, new int[]{4,5})).isEqualTo(4);
    }

    @Test
    public void listTest() {
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add(i);
        }



        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                a.remove(i);


            }
        }

        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}