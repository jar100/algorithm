package meetingtest.kakao.test;

import org.junit.Test;
import programas.BaseTest;


public class KakaoEx4Test extends BaseTest {


    @Test
    public void solution1() {
        KakaoEx4 kakaoEx4 = new KakaoEx4();

        softly.assertThat(kakaoEx4.solution(3,new String[]{"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"})).isEqualTo(4);
    }
    @Test
    public void solution2() {
        KakaoEx4 kakaoEx4 = new KakaoEx4();

        softly.assertThat(kakaoEx4.solution(3,new String[]{"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"})).isEqualTo(3);
    }
    @Test
    public void solution3() {
        KakaoEx4 kakaoEx4 = new KakaoEx4();

        softly.assertThat(kakaoEx4.solution(2,new String[]{"cheries2 200", "alex111 100", "coco 150", "puyo 120"})).isEqualTo(3);
    }

}