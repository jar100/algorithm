package meetingtest.groundx;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Gx01Test {

    Gx01 solution = new Gx01();

    @Test
    public void name1() {
        int[] ints = {0,1,1,0,1,1,1,0};
        assertThat(solution.solution(ints)).isEqualTo(46);
    }

    @Test
    public void name2() {
        int[] ints = {0,1,1,0,1,1,1,0};
        assertThat(solution.solution(ints)).isEqualTo(3);
    }

    @Test
    public void name3() {
        int[] ints = {0,1,1,0,1,1,1,0};
        assertThat(solution.solution(ints)).isEqualTo(3);
    }

    @Test
    public void name4() {
        int[] ints = {0,1,1,0,1,1,1,0};
        assertThat(solution.solution(ints)).isEqualTo(3);
    }
}