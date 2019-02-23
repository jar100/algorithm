package programas.clear.jobpare;

import org.junit.Test;
import programas.BaseTest;

public class jobpare2Test extends BaseTest {
    @Test
    public void name() {
        JobPare2 jobpare2 = new JobPare2();
        softly.assertThat(jobpare2.solution(new int[]{2, 3}, new int[]{1, 2, 3})).isEqualTo(2);
    }

    @Test
    public void name2() {
        JobPare2 jobpare2 = new JobPare2();
        softly.assertThat(jobpare2.solution(new int[]{1, 2, 3}, new int[]{1, 1})).isEqualTo(1);
    }
}