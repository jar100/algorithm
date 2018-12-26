package programas.clear.okparentheses;

import org.junit.Test;
import programas.BaseTest;

public class OkParenthesesTest extends BaseTest {

    @Test
    public void solution() {
        softly.assertThat(OkParentheses.solution("()()")).isTrue();
        softly.assertThat(OkParentheses.solution("(())()")).isTrue();
        softly.assertThat(OkParentheses.solution(")()(")).isFalse();
        softly.assertThat(OkParentheses.solution("(()(")).isFalse();
    }
}