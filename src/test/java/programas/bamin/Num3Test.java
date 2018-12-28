package programas.bamin;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class Num3Test extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(Num3.solution(new int[]{60, 80, 40, 40},new int[]{1, 2, 1, 2}, 3,2,100)).isEqualTo(7);

    }
}