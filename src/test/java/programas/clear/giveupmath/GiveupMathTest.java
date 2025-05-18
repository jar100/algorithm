package programas.clear.giveupmath;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GiveupMathTest {
    @Test
    public void solution() {
        GiveupMath giveupMath = new GiveupMath();
        assertThat(giveupMath.solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{1});

    }

    @Test
    public void solution2() {
        GiveupMath giveupMath = new GiveupMath();
        assertThat(giveupMath.solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});

    }
}