package programas.thievery;

import org.junit.Test;
import programas.BaseTest;

public class ThieveryTest extends BaseTest {

    Thievery thievery = new Thievery();

    @Test
    public void name() {
        softly.assertThat(thievery.solution(new int[]{1, 2, 3, 1})).isEqualTo(4);
    }


    @Test
    public void name2() {
        softly.assertThat(thievery.solution(new int[]{1, 2, 3, 1, 5, 2, 3, 5, 6, 7, 8, 10, 2, 1, 3})).isEqualTo(34);

        // 1 3 5 3 6  8 2 = 30
        // 2 1 2 4 7 10 1 =
    }
}