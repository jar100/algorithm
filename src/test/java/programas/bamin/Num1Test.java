package programas.bamin;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class Num1Test extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(Num1.solution(Integer.toBinaryString(28))).isEqualTo(7);
    }
}