package programas.clear.safeboat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SafeBoatTest {
    SafeBoat safeBoat = new SafeBoat();

    @Test
    public void name() {
        assertThat(safeBoat.solution(new int[]{70, 50, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    public void name1() {
        assertThat(safeBoat.solution(new int[]{70, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    public void name2() {
        assertThat(safeBoat.solution(new int[]{70, 80, 50, 40}, 100)).isEqualTo(3);
    }

    @Test
    public void name3() {
        assertThat(safeBoat.solution(new int[]{40, 50, 50, 60}, 100)).isEqualTo(2);
    }
}