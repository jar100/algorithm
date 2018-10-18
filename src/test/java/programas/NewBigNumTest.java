package programas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NewBigNumTest {
    @Test
    public void test() {
        String y = Integer.toBinaryString(78);
        String x = Integer.toBinaryString(86);
        String z = Integer.toBinaryString(83);
        System.out.println(Integer.bitCount(78));
        System.out.println(y.split("1",-1).length);
        System.out.println(Arrays.toString(x.split("1",-1)));
        assertThat(NewBigNum.solution(78)).isEqualTo(83);
        assertThat(NewBigNum.solution(15)).isEqualTo(23);
    }
}
