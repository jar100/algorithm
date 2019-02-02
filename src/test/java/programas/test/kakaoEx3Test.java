package programas.test;

import org.junit.Test;
import programas.BaseTest;

public class kakaoEx3Test extends BaseTest {

    @Test
    public void solution() {

        KakaoEx3 kakaoEx3 = new KakaoEx3();

        softly.assertThat(kakaoEx3.solution(3,new int[]{4, 2, 2, 5, 3})).isEqualTo(new int[]{2, 3, 1, 5, 4});
    }


}