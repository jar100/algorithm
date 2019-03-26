package programas.Joystick;

import org.junit.Test;
import programas.BaseTest;

public class JoyStickTest extends BaseTest {
    JoyStick joyStick = new JoyStick();

    @Test
    public void name() {
        softly.assertThat(joyStick.solution("JEROEN")).isEqualTo(56);
    }

    @Test
    public void name1() {
        softly.assertThat(joyStick.solution("JAN")).isEqualTo(23);
    }

    @Test
    public void name2() {
        softly.assertThat(joyStick.solution("ABABAAAAAAABA")).isEqualTo(11);
    }

    @Test
    public void name3() {
        softly.assertThat(joyStick.solution("ABAAAAAAAAABB")).isEqualTo(7);
    }


}