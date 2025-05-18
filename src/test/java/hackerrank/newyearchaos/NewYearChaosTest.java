package hackerrank.newyearchaos;

import org.junit.jupiter.api.Test;

public class NewYearChaosTest {
    @Test
    public void name() {
        NewYearChaos.minimumBribes(new int[]{2, 1, 5, 3, 4});
    }

    @Test
    public void name2() {
        NewYearChaos.minimumBribes(new int[]{2, 5, 1, 3, 4});
    }

    @Test
    public void name3() {
        NewYearChaos.minimumBribes(new int[]{1, 2, 5, 3, 4, 7, 8, 6});
    }

    @Test
    public void name4() {
        NewYearChaos.minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }
}