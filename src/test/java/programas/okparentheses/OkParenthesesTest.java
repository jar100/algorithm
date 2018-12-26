package programas.okparentheses;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class OkParenthesesTest extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(OkParentheses.solution("()()")).isTrue();
        softly.assertThat(OkParentheses.solution("(())()")).isTrue();
        softly.assertThat(OkParentheses.solution(")()(")).isFalse();
        softly.assertThat(OkParentheses.solution("(()(")).isFalse();
    }
}