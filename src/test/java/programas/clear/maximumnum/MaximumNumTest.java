package programas.clear.maximumnum;

import org.junit.Before;
import org.junit.Test;
import programas.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumTest extends BaseTest {
    private MaximumNum maximumNum;

    @Before
    public void setup() {
        maximumNum = new MaximumNum();
    }

    @Test
    public void test() {
        List<String> a = new ArrayList<>();
        a.add("20");

        a.add("1");
        a.add("11");
        a.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(a.toString());
    }

    @Test
    public void solution1() {
        softly.assertThat(maximumNum.solution(new int[]{6, 10, 2})).isEqualTo("6210");
    }

    @Test
    public void solution2() {
        softly.assertThat(maximumNum.solution(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");
    }

    @Test
    public void solution3() {
        softly.assertThat(maximumNum.solution(new int[]{1, 10, 11})).isEqualTo("11110");
    }

    @Test
    public void solution4() {
        softly.assertThat(maximumNum.solution(new int[]{6, 10, 2})).isEqualTo("6210");
    }

    @Test
    public void solution5() {
        softly.assertThat(maximumNum.solution(new int[]{6, 10, 2})).isEqualTo("6210");
    }

    @Test
    public void solution6() {
        softly.assertThat(maximumNum.solution(new int[]{0, 0, 0})).isEqualTo("0");
    }
}