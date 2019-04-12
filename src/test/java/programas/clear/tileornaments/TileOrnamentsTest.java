package programas.clear.tileornaments;

import org.junit.Test;
import programas.BaseTest;

public class TileOrnamentsTest extends BaseTest {
    TileOrnaments tileOrnaments = new TileOrnaments();
    @Test
    public void name() {
        softly.assertThat(tileOrnaments.solution(5)).isEqualTo(26);
    }

    @Test
    public void name1() {
        softly.assertThat(tileOrnaments.solution(6)).isEqualTo(42);
    }
}