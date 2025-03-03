package programas.clear.camouflage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CamouflageTest {
    private static Camouflage camouflage;

    @BeforeAll
    public static void setup() {
        camouflage = new Camouflage();
    }

    @Test
    public void solution() {
        assertThat(camouflage.solution(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}})).isEqualTo(5);
    }

    @Test
    public void solution2() {
        assertThat(camouflage.solution2(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}})).isEqualTo(5);
    }
}