package programas.clear.network;

import org.junit.Test;
import programas.BaseTest;

public class NetworkTest extends BaseTest {

    @Test
    public void solution() {
        Network network = new Network();
        softly.assertThat(network.solution(3,new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})).isEqualTo(2);
    }
}