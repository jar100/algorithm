package programas.clear.hindex;

import org.junit.Test;
import programas.BaseTest;

public class HIndexTest extends BaseTest {
    HIndex hIndex = new HIndex();

    @Test
    public void name() {
        softly.assertThat(hIndex.solution(new int[]{3, 0, 6, 1, 5})).isEqualTo(3);
    }

    @Test
    public void name2() {
        softly.assertThat(hIndex.solution(new int[]{2, 0, 6, 1, 5})).isEqualTo(2);
    }

    @Test
    public void name3() {
        softly.assertThat(hIndex.solution(new int[]{3, 4, 6, 1, 5, 11, 15})).isEqualTo(4);

    }

    @Test
    public void name4() {
        softly.assertThat(hIndex.solution(new int[]{2, 2, 2, 1, 5})).isEqualTo(2);
    }

    @Test
    public void name5() {
        softly.assertThat(hIndex.solution(new int[]{3, 4, 0, 2, 2, 11, 15})).isEqualTo(3);

    }

    @Test
    public void name6() {
        softly.assertThat(hIndex.solution(new int[]{22, 42})).isEqualTo(2);


    }
}