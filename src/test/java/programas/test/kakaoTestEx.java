package programas.test;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class kakaoTestEx extends BaseTest {

    @Test
    public void solution() {
        kakaoEx1 kakaoEx1 = new kakaoEx1();
        softly.assertThat(kakaoEx1.findCase("01012345678")).isEqualTo(2);
        softly.assertThat(kakaoEx1.findCase("010123456781")).isEqualTo(-1);

        softly.assertThat(kakaoEx1.findCase("+82-10-3434-2323")).isEqualTo(3);
        softly.assertThat(kakaoEx1.findCase("+82-10-3434-2323-1")).isEqualTo(-1);
        softly.assertThat(kakaoEx1.findCase("+82-10-3434-2323")).isEqualTo(3);



        softly.assertThat(kakaoEx1.findCase("010-1234-5678")).isEqualTo(1);
        softly.assertThat(kakaoEx1.findCase("010-1234-56781")).isEqualTo(-1);


    }
}