package programas.clear.bamin;

import org.junit.Test;
import programas.BaseTest;

public class Num4Test extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},55)).isEqualTo(-1);
        softly.assertThat(Num4.solution(new int[]{1, 4, 10, 15},15)).isEqualTo(3);
        softly.assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},22)).isEqualTo(4);
        softly.assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},4)).isEqualTo(1);
        softly.assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},3)).isEqualTo(-1);
    }
}