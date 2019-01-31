package programas.kakao;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class kakaoEx1Test extends BaseTest {

    @Test
    public void solution() {
        kakaoEx kakaoEx = new kakaoEx();

        softly.assertThat(kakaoEx.solution2(new int[][]{{1, 4}, {3, 4}, {3, 10}})).isEqualTo(new int[]{1, 10});
    }
}