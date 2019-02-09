package programas.clear.operationdevelopment;

import org.junit.Test;
import programas.BaseTest;

public class operateiondevelopmentTest extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(Operateiondevelopment.solution(new int[]{93,30,55},	new int[]{1,30,5})).isEqualTo(new int[]{2,1});
    }
}