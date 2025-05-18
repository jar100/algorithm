package baekjun.clear.baek1193;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Baek1193Test {

    @Test
    public void solution() {
        int n = 1;
        assertThat(Baek1193.solution(n)).isEqualTo("1/1");

        n = 2;
        assertThat(Baek1193.solution(n)).isEqualTo("1/2");

    }
}