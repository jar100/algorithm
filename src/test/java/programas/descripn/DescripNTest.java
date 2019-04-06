package programas.descripn;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class DescripNTest extends BaseTest {
    DescripN descripN = new DescripN();

    @Test
    public void name() {
        softly.assertThat(descripN.solution(5,12)).isEqualTo(	4);
    }
}