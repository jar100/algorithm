package programas.clear.targetnum;

import org.junit.Test;
import programas.BaseTest;

public class TargetNumTest extends BaseTest {
    TargetNum targetNum = new TargetNum();

    @Test
    public void name() {
        softly.assertThat(targetNum.solution(new int[]{1,1,1,1,1}, 3)).isEqualTo(5);
    }

    @Test
    public void name2() {
        softly.assertThat(targetNum.solution(new int[]{1,2,3,4,5}, 9)).isEqualTo(5);
    }
}