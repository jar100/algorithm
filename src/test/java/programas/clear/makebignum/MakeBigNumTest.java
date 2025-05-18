package programas.clear.makebignum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MakeBigNumTest {
    MakeBigNum makeBigNum = new MakeBigNum();

    @Test
    public void name() {
        assertThat(makeBigNum.solution("1924",2)).isEqualTo("94");
    }

    @Test
    public void name1() {
        assertThat(makeBigNum.solution("19241212",2)).isEqualTo("941212");
    }

    @Test
    public void name2() {
        assertThat(makeBigNum.solution("179843214",5)).isEqualTo("9844");
    }

    @Test
    public void name3() {
        assertThat(makeBigNum.solution("179843214",1)).isEqualTo("79843214");
    }

    @Test
    public void name4() {
        assertThat(makeBigNum.solution("99999999999999999999999999999999",9)).isEqualTo("99999999999999999999999");
    }

}