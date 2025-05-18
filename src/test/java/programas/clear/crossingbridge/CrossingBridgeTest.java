package programas.clear.crossingbridge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CrossingBridgeTest {

    @Test
    public void solution() {
        assertThat(CrossingBridge.solution(2, 10, new int[]{7,4,5,6})).isEqualTo(8);
        assertThat(CrossingBridge.solution(100, 100, new int[]{10})).isEqualTo(101);

    }

    @Test
    public void solution2() {
        assertThat(CrossingBridge.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10})).isEqualTo(110);

    }
}