package programas.samenumdelet;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class SameNumDeletTest extends BaseTest {
    SameNumDelet sameNumDelet = new SameNumDelet();

    @Test
    public void name() {
        softly.assertThat(sameNumDelet.solution("baabaa")).isEqualTo(1);
    }
}