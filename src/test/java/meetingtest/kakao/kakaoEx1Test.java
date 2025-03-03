package meetingtest.kakao;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class kakaoEx1Test {

    @Test
    public void solution() {
        kakaoEx kakaoEx = new kakaoEx();

        assertThat(kakaoEx.solution2(new int[][]{{1, 4}, {3, 4}, {3, 10}})).isEqualTo(new int[]{1, 10});
    }
}