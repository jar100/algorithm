package programas.clear.samenumdelet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SameNumDeletTest {
    SameNumDelet sameNumDelet = new SameNumDelet();

    @Test
    public void name() {
        assertThat(sameNumDelet.solution("baabaa")).isEqualTo(1);
    }
}