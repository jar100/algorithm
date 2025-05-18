package programas.clear.bestalbum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BestAlbumTest {

    @Test
    public void solution() {
        BestAlbum bestAlbum = new BestAlbum();

        assertThat(bestAlbum.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}))
                .isEqualTo(new int[]{4, 1, 3, 0});
    }
}