package programas.clear.giveupmath;

import org.junit.Test;
import programas.BaseTest;

public class GiveupMathTest extends BaseTest {
    @Test
    public void solution() {
        GiveupMath giveupMath = new GiveupMath();
        softly.assertThat(giveupMath.solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{1});

    }

    @Test
    public void solution2() {
        GiveupMath giveupMath = new GiveupMath();
        softly.assertThat(giveupMath.solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});

    }
}