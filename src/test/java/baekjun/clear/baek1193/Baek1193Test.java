package baekjun.clear.baek1193;

import org.junit.Test;
import programas.BaseTest;

public class Baek1193Test extends BaseTest {

    @Test
    public void solution() {
        int n = 1;
        softly.assertThat(Baek1193.solution(n)).isEqualTo("1/1");

        n = 2;
        softly.assertThat(Baek1193.solution(n)).isEqualTo("1/2");

    }
}