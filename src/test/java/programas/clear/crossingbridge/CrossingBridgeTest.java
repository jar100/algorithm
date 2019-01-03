package programas.clear.crossingbridge;

import org.junit.Test;
import programas.BaseTest;

public class CrossingBridgeTest extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(CrossingBridge.solution(2, 10, new int[]{7,4,5,6})).isEqualTo(8);
        softly.assertThat(CrossingBridge.solution(100, 100, new int[]{10})).isEqualTo(101);

    }

    @Test
    public void solution2() {
        softly.assertThat(CrossingBridge.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10})).isEqualTo(110);

    }
}