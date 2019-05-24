package meetingtest.groundx;

import org.junit.Test;
import programas.BaseTest;

public class RefrigeratorTest extends BaseTest {
    Refrigerator refrigerator = new Refrigerator();

    @Test
    public void name() {
        int[] open = {3, 5, 7};
        int[] close = {4, 10, 12};

        softly.assertThat(refrigerator.solution(open, close)).isEqualTo(6);
    }


    @Test
    public void name1() {
        int[] open = {4, 7, 9, 16};
        int[] close = {2, 5, 12, 14, 20};
        softly.assertThat(refrigerator.solution(open, close)).isEqualTo(10);
    }


    @Test
    public void name3() {
        int[] open = {1, 2, 3};
        int[] close = {4, 5, 6, 7, 20};
        softly.assertThat(refrigerator.solution(open, close)).isEqualTo(3);

    }


    @Test
    public void name4() {
        int[] open = {2, 3, 4, 5, 6, 8, 9, 10, 11};
        int[] close = {7, 12};
        softly.assertThat(refrigerator.solution(open, close)).isEqualTo(9);

    }

    @Test
    public void name5() {
        int[] open = {2, 3, 4, 5, 6, 8, 9, 10, 11};
        int[] close = {12};
        softly.assertThat(refrigerator.solution(open, close)).isEqualTo(10);

    }


    @Test
    public void name6() {
        int[] open = {2};
        int[] close = {1, 4, 5, 6, 7, 8, 9, 10};
        softly.assertThat(refrigerator.solution(open, close)).isEqualTo(2);

    }


}