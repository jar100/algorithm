package programas.clear.jobpare;

import org.junit.Test;
import programas.BaseTest;

public class jobpare1Test extends BaseTest {
    @Test
    public void solution() {
        JobPare1 jobpare1 = new JobPare1();

        softly.assertThat(jobpare1.solution(33)).isEqualTo(4);
    }

    @Test
    public void solution2() {
        JobPare1 jobpare1 = new JobPare1();

        softly.assertThat(jobpare1.solution(9)).isEqualTo(0);
    }
}