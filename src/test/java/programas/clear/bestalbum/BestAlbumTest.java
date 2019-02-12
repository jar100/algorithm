package programas.clear.bestalbum;

import org.junit.Test;
import programas.BaseTest;

public class BestAlbumTest extends BaseTest {

    @Test
    public void solution() {
        BestAlbum bestAlbum = new BestAlbum();

        softly.assertThat(bestAlbum.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}))
                .isEqualTo(new int[]{4, 1, 3, 0});
    }
}