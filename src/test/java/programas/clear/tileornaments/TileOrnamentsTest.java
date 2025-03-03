package programas.clear.tileornaments;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TileOrnamentsTest {
    TileOrnaments tileOrnaments = new TileOrnaments();
    @Test
    public void name() {
        assertThat(tileOrnaments.solution(5)).isEqualTo(26);
    }

    @Test
    public void name1() {
        assertThat(tileOrnaments.solution(6)).isEqualTo(42);
    }
}