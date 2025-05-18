package programas.clear.jobpare;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class jobpare2Test {
    @Test
    public void name() {
        JobPare2 jobpare2 = new JobPare2();
        assertThat(jobpare2.solution(new int[]{2, 3}, new int[]{1, 2, 3})).isEqualTo(2);
    }

    @Test
    public void name2() {
        JobPare2 jobpare2 = new JobPare2();
        assertThat(jobpare2.solution(new int[]{1, 2, 3}, new int[]{1, 1})).isEqualTo(1);
    }
}