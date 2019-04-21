package programas.clear.safeboat;

import org.junit.Test;
import programas.BaseTest;

public class SafeBoatTest extends BaseTest {
    SafeBoat safeBoat = new SafeBoat();

    @Test
    public void name() {
        softly.assertThat(safeBoat.solution(new int[]{70, 50, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    public void name1() {
        softly.assertThat(safeBoat.solution(new int[]{70, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    public void name2() {
        softly.assertThat(safeBoat.solution(new int[]{70, 80, 50, 40}, 100)).isEqualTo(3);
    }

    @Test
    public void name3() {
        softly.assertThat(safeBoat.solution(new int[]{40, 50, 50, 60}, 100)).isEqualTo(2);
    }
}