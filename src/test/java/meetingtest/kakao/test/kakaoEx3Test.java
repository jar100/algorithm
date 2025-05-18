package meetingtest.kakao.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class kakaoEx3Test {

    @Test
    public void solution() {

        KakaoEx3 kakaoEx3 = new KakaoEx3();

        assertThat(kakaoEx3.solution(3,new int[]{4, 2, 2, 5, 3})).isEqualTo(new int[]{2, 3, 1, 5, 4});
    }


}