package programas.onemore.Ironrod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IronRodTest {

    private static IronRod ironRod;

    @BeforeAll
    public static void setup() {
        ironRod = new IronRod();
    }
    @Test
    public void solution() {
        long start = System.currentTimeMillis();
        String answer = "";
        answer = "()(((()())(())()))(())";
        assertThat(ironRod.solution(answer)).isEqualTo(17);
        long time = System.currentTimeMillis();
        System.out.println(time - start);
    }

    @Test
    public void solutionOthers() {
        long start = System.currentTimeMillis();
        String answer = "";
        answer = "()(((()())(())()))(())";
        assertThat(ironRod.solution2(answer)).isEqualTo(17);
        long time = System.currentTimeMillis();
        System.out.println(time - start);
    }
}