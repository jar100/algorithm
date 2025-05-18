package programas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BaseballTest {

    public static int answer;
    int yourNum;
    public static Baseball baseball;
    @BeforeAll
    public static void setUp() {
        answer = 123;
        baseball = Baseball.ofNewGame(answer);
    }



    @Test
    public void ballTest() {
        yourNum = 234;
        baseball.check(yourNum);
        int result = baseball.resultBall();
        assertThat(result).isEqualTo(2);
        baseball.reset();
        yourNum = 213;
        baseball.check(yourNum);
        result = baseball.resultBall();
        assertThat(result).isEqualTo(2);

    }

    @Test
    public void strikeTest() {
        yourNum = 156;
        baseball.check(yourNum);
        int result = baseball.resultStrike();
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void outTest() {
        yourNum = 567;
        baseball.check(yourNum);
        boolean result = baseball.isOut();
        assertThat(result).isTrue();
    }
}
