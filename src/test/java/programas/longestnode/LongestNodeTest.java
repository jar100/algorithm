package programas.longestnode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LongestNodeTest {
    @Test
    public void name() {
        LongestNode longestNode = new LongestNode();
        assertThat(longestNode.solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}})).isEqualTo(3);
    }

    @Test
    public void name1() {
        LongestNode longestNode = new LongestNode();
        assertThat(longestNode.solution2(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}})).isEqualTo(3);
    }


}