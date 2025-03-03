package programas.clear.bamin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Num1Test {

    @Test
    public void solution() {
        assertThat(Num1.solution(Integer.toBinaryString(28))).isEqualTo(7);
    }
}