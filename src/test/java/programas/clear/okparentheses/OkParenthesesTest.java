package programas.clear.okparentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OkParenthesesTest {

    @Test
    public void solution() {
        assertThat(OkParentheses.solution("()()")).isTrue();
        assertThat(OkParentheses.solution("(())()")).isTrue();
        assertThat(OkParentheses.solution(")()(")).isFalse();
        assertThat(OkParentheses.solution("(()(")).isFalse();
    }
}