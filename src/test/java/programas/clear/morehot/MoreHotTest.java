package programas.clear.morehot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoreHotTest {

    @Test
    public void solution() {
        MoreHot moreHot = new MoreHot();

        assertThat(moreHot.solution(new int[]{1, 2, 3, 9, 10, 12}, 7)).isEqualTo(2);
        assertThat(moreHot.solution(new int[]{0, 0, 3, 9, 10, 12}, 7)).isEqualTo(3);
    }
}