package meetingtest.groundx;

import org.junit.Test;
import programas.BaseTest;

public class TriangleTest extends BaseTest {

    Triangle solution = new Triangle();

    @Test
    public void testCase_1() {
        softly.assertThat(solution.solution(3, 5)).isEqualTo(7);
    }

    @Test
    public void testCase_2() {
        softly.assertThat(solution.solution(2, 5)).isEqualTo(6);
    }

    @Test
    public void testCase_3() {
        softly.assertThat(solution.solution(3, 3)).isEqualTo(3);
    }

    @Test
    public void testCase_4() {
        softly.assertThat(solution.solution(4, 5)).isEqualTo(8);
    }

    @Test
    public void testCase_5() {
        softly.assertThat(solution.solution(2, 7)).isEqualTo(8);
    }
}