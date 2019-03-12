package programas.clear.indexknum;

import org.junit.Test;
import programas.BaseTest;

public class IndexOfKNumTest extends BaseTest {
    @Test
    public void name() {
        IndexOfKNum indexOfKNum = new IndexOfKNum();

        softly.assertThat(indexOfKNum.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}))
                .isEqualTo(new int[]{5, 6, 3});
    }
}