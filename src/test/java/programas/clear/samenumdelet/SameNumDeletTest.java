package programas.clear.samenumdelet;

import org.junit.Test;
import programas.BaseTest;

public class SameNumDeletTest extends BaseTest {
    SameNumDelet sameNumDelet = new SameNumDelet();

    @Test
    public void name() {
        softly.assertThat(sameNumDelet.solution("baabaa")).isEqualTo(1);
    }
}