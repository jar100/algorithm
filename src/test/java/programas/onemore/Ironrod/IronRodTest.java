package programas.onemore.Ironrod;

import org.junit.Before;
import org.junit.Test;
import programas.BaseTest;

public class IronRodTest extends BaseTest {

    private IronRod ironRod;

    @Before
    public void setup() {
        ironRod = new IronRod();
    }
    @Test
    public void solution() {
        long start = System.currentTimeMillis();
        String answer = "";
        answer = "()(((()())(())()))(())";
        softly.assertThat(ironRod.solution(answer)).isEqualTo(17);
        long time = System.currentTimeMillis();
        System.out.println(time - start);
    }

    @Test
    public void solutionOthers() {
        long start = System.currentTimeMillis();
        String answer = "";
        answer = "()(((()())(())()))(())";
        softly.assertThat(ironRod.solution2(answer)).isEqualTo(17);
        long time = System.currentTimeMillis();
        System.out.println(time - start);
    }
}