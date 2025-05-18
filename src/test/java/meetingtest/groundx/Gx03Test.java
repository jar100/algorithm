package meetingtest.groundx;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Gx03Test {

    Gx03 solution = new Gx03();

    @Test
    public void name1() {
        String[] strings = {".o.", ".ox", "x.."};
        assertThat(solution.solution(strings)).isEqualTo("D");
    }

    @Test
    public void name2() {
        String[] strings = {"oo.", ".x.", "oxx"};

        assertThat(solution.solution(strings)).isEqualTo("O");
    }

    @Test
    public void name3() {
        String[] strings = {"o.o", ".x.", "oxx"};

        assertThat(solution.solution(strings)).isEqualTo("X");
    }

    @Test
    public void checkRow() {
        String[] strings = {".o.", ".xx", "o.."};
        assertThat(solution.solution(strings)).isEqualTo("X");
    }

    @Test
    public void checkRowWhenOWin() {
        String[] strings = {".oo", ".xx", "o.."};
        assertThat(solution.solution(strings)).isEqualTo("X");
    }

    @Test
    public void checkClomnWhenOWin() {
        String[] strings = {".oo", ".ox", "xx."};
        assertThat(solution.solution(strings)).isEqualTo("X");
    }
}