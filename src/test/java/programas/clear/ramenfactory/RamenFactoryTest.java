package programas.clear.ramenfactory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RamenFactoryTest {
    @Test
    public void name() {
        RamenFactory ramenFactory = new RamenFactory();

        assertThat(ramenFactory.solution(4, new int[]{4, 10, 15}, new int[]{20, 5, 10}, 30))
                .isEqualTo(2);
    }

    @Test
    public void name1() {
        RamenFactory ramenFactory = new RamenFactory();

        assertThat(ramenFactory.solution(4, new int[]{4, 12, 15}, new int[]{10, 6, 10}, 30))
                .isEqualTo(3);
    }

    @Test
    public void name2() {
        RamenFactory ramenFactory = new RamenFactory();

        assertThat(ramenFactory.solution(4, new int[]{4, 10, 15}, new int[]{10, 11, 20}, 20))
                .isEqualTo(2);
    }

    @Test
    public void name3() {
        RamenFactory ramenFactory = new RamenFactory();

        assertThat(ramenFactory.solution(4, new int[]{4, 10, 11, 12, 13, 14}, new int[]{11, 3, 2, 5, 1, 6}, 27))
                .isEqualTo(4);

        // 4 일 11 톤
        //10 일 5톤 안받아
        //15 일  15톤  20

    }

    @Test
    public void name4() {
        RamenFactory ramenFactory = new RamenFactory();

        assertThat(ramenFactory.solution(4, new int[]{1, 2, 3, 4}, new int[]{10, 40, 30, 20}, 100))
                .isEqualTo(4);
    }

}