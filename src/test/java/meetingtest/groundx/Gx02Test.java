package meetingtest.groundx;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class Gx02Test extends BaseTest {
    Gx02 solution = new Gx02();

    @Test
    public void name1() {

        softly.assertThat(solution.solution("3(hi)")).isEqualTo("hihihi");
    }

    @Test
    public void name2() {

        softly.assertThat(solution.solution("2(3(hi)co)")).isEqualTo("hihihicohihihico");
    }

    @Test
    public void name3() {

        softly.assertThat(solution.solution("10(p)")).isEqualTo("pppppppppp");
    }

    @Test
    public void name4() {

        softly.assertThat(solution.solution("2(2(hi)2(co))x2(bo)")).isEqualTo("hihicocohihicocoxbobo");
    }
}