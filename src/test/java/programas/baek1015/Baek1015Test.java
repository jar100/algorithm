package programas.baek1015;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class Baek1015Test extends BaseTest {

    @Test
    public void solution() {
        Baek1015 baek1015 = new Baek1015();

        softly.assertThat(baek1015.solution(3, new int[]{2, 3, 1})).isEqualTo(new int[]{1, 2, 0});
    }
}