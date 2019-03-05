package programas.clear.ramenfactory;

import org.junit.Test;
import programas.BaseTest;

public class RamenFactoryTest extends BaseTest {
    @Test
    public void name() {
        RamenFactory ramenFactory = new RamenFactory();

        softly.assertThat(ramenFactory.solution(4,new int[]{4,10,15}, new int[]{20, 5, 10}, 30))
                .isEqualTo(2);
    }

    @Test
    public void name1() {
        RamenFactory ramenFactory = new RamenFactory();

        softly.assertThat(ramenFactory.solution(4,new int[]{4,12,15}, new int[]{10, 6, 10}, 30))
                .isEqualTo(3);
    }

    @Test
    public void name2() {
        RamenFactory ramenFactory = new RamenFactory();

        softly.assertThat(ramenFactory.solution(4,new int[]{4,10,15}, new int[]{10, 11, 20}, 20))
                .isEqualTo(2);
    }
}