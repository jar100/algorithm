package programas.clear.bamin;


import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Num3Test {

    @Test
    public void setTest() {
        Set<Integer> mySet = new HashSet<>();
        Integer[] a = new Integer[2];
        a[0] = 12;
        a[1] = 3;
        Integer b = 3;
        mySet.add(b);
        assertThat(mySet.contains(3)).isTrue();
    }

    @Test
    public void solution() {
        assertThat(Num3.solution(new int[]{60, 80, 40, 40},new int[]{1, 2, 1, 2}, 3,2,100)).isEqualTo(7);

    }
}