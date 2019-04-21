package programas.clear.makebignum;

import org.junit.Test;
import programas.BaseTest;

public class MakeBigNumTest extends BaseTest {
    MakeBigNum makeBigNum = new MakeBigNum();

    @Test
    public void name() {
        softly.assertThat(makeBigNum.solution("1924",2)).isEqualTo("94");
    }

    @Test
    public void name1() {
        softly.assertThat(makeBigNum.solution("19241212",2)).isEqualTo("941212");
    }

    @Test
    public void name2() {
        softly.assertThat(makeBigNum.solution("179843214",5)).isEqualTo("9844");
    }

    @Test
    public void name3() {
        softly.assertThat(makeBigNum.solution("179843214",1)).isEqualTo("79843214");
    }

    @Test
    public void name4() {
        softly.assertThat(makeBigNum.solution("99999999999999999999999999999999",9)).isEqualTo("99999999999999999999999");
    }

}