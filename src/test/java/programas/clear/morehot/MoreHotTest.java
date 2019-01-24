package programas.clear.morehot;

import org.junit.Test;
import programas.BaseTest;

public class MoreHotTest extends BaseTest {

    @Test
    public void solution() {
        MoreHot moreHot = new MoreHot();

        softly.assertThat(moreHot.solution(new int[]{1, 2, 3, 9, 10, 12}, 7)).isEqualTo(2);
        softly.assertThat(moreHot.solution(new int[]{0, 0, 3, 9, 10, 12}, 7)).isEqualTo(3);
    }
}