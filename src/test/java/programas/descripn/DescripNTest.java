package programas.descripn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DescripNTest {
    DescripN descripN = new DescripN();

    @Test
    public void name() {
        assertThat(descripN.solution(5,12)).isEqualTo(	4);
    }
}