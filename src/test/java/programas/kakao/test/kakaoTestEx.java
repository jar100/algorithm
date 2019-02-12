package programas.kakao.test;

import org.junit.Test;
import programas.BaseTest;

public class kakaoTestEx extends BaseTest {

    @Test
    public void solution() {
        KakaoEx1 kakaoEx1 = new KakaoEx1();
        softly.assertThat(kakaoEx1.findCase("01012345678")).isEqualTo(2);
        softly.assertThat(kakaoEx1.findCase("010123456781")).isEqualTo(-1);
        softly.assertThat(kakaoEx1.findCase("010123456-8")).isEqualTo(-1);

        softly.assertThat(kakaoEx1.findCase("+82-10-3434-2323")).isEqualTo(3);
        softly.assertThat(kakaoEx1.findCase("+82-10-3434-2323-1")).isEqualTo(-1);
        softly.assertThat(kakaoEx1.findCase("+82-10-3434-2323")).isEqualTo(3);



        softly.assertThat(kakaoEx1.findCase("010-1234-5678")).isEqualTo(1);
        softly.assertThat(kakaoEx1.findCase("010-1234-56781")).isEqualTo(-1);


    }
}