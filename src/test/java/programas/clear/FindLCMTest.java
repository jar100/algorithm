package programas.clear;

import org.junit.Test;
import programas.clear.FindLCM;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FindLCMTest {
    @Test
    public void mainTest() {
        System.out.println(6 % 12);
        int[] input = {2, 6, 8, 14};
        assertThat(FindLCM.solution(input)).isEqualTo(168);
        int[] input2 = {1, 2, 3};
        assertThat(FindLCM.solution(input2)).isEqualTo(6);

    }
}
