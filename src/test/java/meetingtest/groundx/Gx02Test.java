package meetingtest.groundx;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Gx02Test {
    Gx02 solution = new Gx02();

    @Test
    public void name1() {

        assertThat(solution.solution("3(hi)")).isEqualTo("hihihi");
    }

    @Test
    public void name2() {

        assertThat(solution.solution("2(3(hi)co)")).isEqualTo("hihihicohihihico");
    }

    @Test
    public void name3() {

        assertThat(solution.solution("10(p)")).isEqualTo("pppppppppp");
    }

    @Test
    public void name4() {

        assertThat(solution.solution("2(2(hi)2(co))x2(bo)")).isEqualTo("hihicocohihicocoxbobo");
    }
}