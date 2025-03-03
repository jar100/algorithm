package meetingtest.groundx;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TriangleTest {

    Triangle solution = new Triangle();

    @Test
    public void testCase_1() {
        assertThat(solution.solution(3, 5)).isEqualTo(7);
    }

    @Test
    public void testCase_2() {
        assertThat(solution.solution(2, 5)).isEqualTo(6);
    }

    @Test
    public void testCase_3() {
        assertThat(solution.solution(3, 3)).isEqualTo(3);
    }

    @Test
    public void testCase_4() {
        assertThat(solution.solution(4, 5)).isEqualTo(8);
    }

    @Test
    public void testCase_5() {
        assertThat(solution.solution(2, 7)).isEqualTo(8);
    }
}