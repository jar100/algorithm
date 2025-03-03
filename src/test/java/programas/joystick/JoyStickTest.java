package programas.joystick;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JoyStickTest {
    JoyStick joyStick = new JoyStick();

    @Test
    public void name() {
        assertThat(joyStick.solution("JEROEN")).isEqualTo(56);
    }

    @Test
    public void name1() {
        assertThat(joyStick.solution("JAN")).isEqualTo(23);
    }

    @Test
    public void name2() {
        assertThat(joyStick.solution("ABABAAAAAAABA")).isEqualTo(11);
    }

    @Test
    public void name3() {
        assertThat(joyStick.solution("ABAAAAAAAAABB")).isEqualTo(7);
    }


}