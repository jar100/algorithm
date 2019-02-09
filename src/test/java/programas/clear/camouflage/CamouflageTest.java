package programas.clear.camouflage;

import org.junit.Before;
import org.junit.Test;
import programas.BaseTest;

public class CamouflageTest extends BaseTest {
    private Camouflage camouflage;

    @Before
    public void setup() {
        camouflage = new Camouflage();
    }

    @Test
    public void solution() {
        softly.assertThat(camouflage.solution(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}})).isEqualTo(5);
    }

    @Test
    public void solution2() {
        softly.assertThat(camouflage.solution2(new String[][]{
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}})).isEqualTo(5);
    }
}