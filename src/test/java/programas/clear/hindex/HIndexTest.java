package programas.clear.hindex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HIndexTest {
    HIndex hIndex = new HIndex();

    @Test
    public void name() {
        assertThat(hIndex.solution(new int[]{3, 0, 6, 1, 5})).isEqualTo(3);
    }

    @Test
    public void name2() {
        assertThat(hIndex.solution(new int[]{2, 0, 6, 1, 5})).isEqualTo(2);
    }

    @Test
    public void name3() {
        assertThat(hIndex.solution(new int[]{3, 4, 6, 1, 5, 11, 15})).isEqualTo(4);

    }

    @Test
    public void name4() {
        assertThat(hIndex.solution(new int[]{2, 2, 2, 1, 5})).isEqualTo(2);
    }

    @Test
    public void name5() {
        assertThat(hIndex.solution(new int[]{3, 4, 0, 2, 2, 11, 15})).isEqualTo(3);

    }

    @Test
    public void name6() {
        assertThat(hIndex.solution(new int[]{22, 42})).isEqualTo(2);


    }
}