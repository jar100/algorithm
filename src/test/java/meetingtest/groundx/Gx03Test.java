package meetingtest.groundx;

import org.junit.Test;
import programas.BaseTest;

public class Gx03Test extends BaseTest {

    Gx03 solution = new Gx03();

    @Test
    public void name1() {
        String[] strings = {".o.", ".ox", "x.."};
        softly.assertThat(solution.solution(strings)).isEqualTo("D");
    }

    @Test
    public void name2() {
        String[] strings = {"oo.", ".x.", "oxx"};

        softly.assertThat(solution.solution(strings)).isEqualTo("O");
    }

    @Test
    public void name3() {
        String[] strings = {"o.o", ".x.", "oxx"};

        softly.assertThat(solution.solution(strings)).isEqualTo("X");
    }

    @Test
    public void checkRow() {
        String[] strings = {".o.", ".xx", "o.."};
        softly.assertThat(solution.solution(strings)).isEqualTo("X");
    }

    @Test
    public void checkRowWhenOWin() {
        String[] strings = {".oo", ".xx", "o.."};
        softly.assertThat(solution.solution(strings)).isEqualTo("X");
    }

    @Test
    public void checkClomnWhenOWin() {
        String[] strings = {".oo", ".ox", "xx."};
        softly.assertThat(solution.solution(strings)).isEqualTo("X");
    }
}