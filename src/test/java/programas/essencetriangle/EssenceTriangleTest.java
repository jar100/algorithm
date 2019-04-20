package programas.essencetriangle;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class EssenceTriangleTest extends BaseTest {
    EssenceTriangle essenceTriangle = new EssenceTriangle();

    @Test
    public void name() {
        softly.assertThat(essenceTriangle.solution(
                new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}))
                .isEqualTo(30);
    }
}