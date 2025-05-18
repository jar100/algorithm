package programas.clear.jobpare;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JobPare3Test {
    @Test
    public void name() {
        JobPare3 jobpare3 = new JobPare3();
        assertThat(jobpare3.solution(new int[]{200, 120, 150}, new int[][]{{30, 100}, {500, 30}, {100, 400}})).isEqualTo(new int[]{1, 2});
    }

    @Test
    public void name2() {
        JobPare3 jobpare3 = new JobPare3();
        assertThat(jobpare3.solution(new int[]{300,200,500}, new int[][]{{1000, 600}, {400, 500}, {300, 100}})).isEqualTo(new int[]{3});
    }

    @Test
    public void name3() {
        JobPare3 jobpare3 = new JobPare3();
        assertThat(jobpare3.solution(new int[]{300,200,500}, new int[][]{{1000, 200}, {400, 500}, {300, 300}})).isEqualTo(new int[]{1,3});
    }

    @Test
    public void name4() {
        JobPare3 jobpare3 = new JobPare3();
        assertThat(jobpare3.solution(new int[]{300,200,500}, new int[][]{{1000, 200}, {1200, 200}, {300, 300}})).isEqualTo(new int[]{1,2});
    }

    @Test
    public void name5() {
        JobPare3 jobpare3 = new JobPare3();
        assertThat(jobpare3.solution(new int[]{300,200,500}, new int[][]{{1000, 200}, {1200, 200}, {1500, 300}})).isEqualTo(new int[]{2,3});
    }
}