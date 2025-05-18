package programas.clear.thievery;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ThieveryTest {

    Thievery thievery = new Thievery();

    @Test
    public void name() {
        assertThat(thievery.solution(new int[]{1, 2, 3, 1})).isEqualTo(4);
    }


    @Test
    public void name2() {
        assertThat(thievery.solution(new int[]{1, 2, 3, 1, 5, 2, 3, 5, 6, 7, 8, 10, 2, 1, 3})).isEqualTo(33);

        // 1 3 5 3 6  8 2 = 30
        // 2 1 2 4 7 10 1 =
    }

    @Test
    public void name3() {
        assertThat(thievery.solution(new int[]{1, 2, 3, 1, 5})).isEqualTo(8);

        // 1 3 5 3 6  8 2 = 30
        // 2 1 2 4 7 10 1 =
    }
}