package programas.clear.findsosu;

import org.junit.Test;
import programas.BaseTest;

public class FindSosuTest extends BaseTest {
    @Test
    public void name() {
        FindSosu findSosu = new FindSosu();

        softly.assertThat(findSosu.solution("17")).isEqualTo(3);
    }

    @Test
    public void name1() {
        FindSosu findSosu = new FindSosu();

        softly.assertThat(findSosu.solution("011")).isEqualTo(2);
    }

    @Test
    public void name2() {
        FindSosu findSosu = new FindSosu();

        softly.assertThat(findSosu.solution("123")).isEqualTo(5);
    }

    @Test
    public void name3() {
        FindSosu findSosu = new FindSosu();

        softly.assertThat(findSosu.solution("1223")).isEqualTo(9);
    }

    @Test
    public void name4() {
        FindSosu findSosu = new FindSosu();

        softly.assertThat(findSosu.solution("1223721")).isEqualTo(151);
    }
}