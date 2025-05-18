package programas.clear.bamin;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Num4Test {

    @Test
    public void solution() {
        assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},55)).isEqualTo(-1);
        assertThat(Num4.solution(new int[]{1, 4, 10, 15},15)).isEqualTo(3);
        assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},22)).isEqualTo(4);
        assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},4)).isEqualTo(1);
        assertThat(Num4.solution(new int[]{1, 4, 10, 15,22},3)).isEqualTo(-1);
    }
}