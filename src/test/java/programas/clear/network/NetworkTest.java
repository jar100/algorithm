package programas.clear.network;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NetworkTest {

    @Test
    public void solution() {
        Network network = new Network();
        assertThat(network.solution(3,new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})).isEqualTo(2);
    }
}