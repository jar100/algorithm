package programas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MakeJadenCaseTest {
    @Test
    public void Tests() {
        String a = "3people 3unF3ollowed me";
        String[] b = a.split(" ");
        System.out.println(Arrays.toString(b));
        assertThat(MakeJadenCase.solution(a)).isEqualTo("3people 3unf3ollowed Me");
        a = "for the last week";
        assertThat(MakeJadenCase.solution(a)).isEqualTo("For The Last Week");
        a = "   abs aee";
        b = a.split(" ");
        System.out.println(Arrays.toString(b));
        assertThat(MakeJadenCase.solution(a)).isEqualTo("   Abs Aee");
        assertThat(MakeJadenCase.solution("answer answer answer    answer answer -answer ")).isEqualTo("A A A    A A -answer ");
    }
}
