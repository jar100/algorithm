package programas.clear.targetnum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TargetNumTest {
    TargetNum targetNum = new TargetNum();

    @Test
    public void name() {
        assertThat(targetNum.solution(new int[]{1,1,1,1,1}, 3)).isEqualTo(5);
    }

    @Test
    public void name2() {
        assertThat(targetNum.solution(new int[]{1,2,3,4,5}, 9)).isEqualTo(5);
    }
}