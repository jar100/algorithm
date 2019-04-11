package programas.clear;

import org.junit.Test;
import programas.clear.NewBigNum;

import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NewBigNumTest {
    @Test
    public void test() {
        int n = 3;
        String y = Integer.toBinaryString(n);
        String x = Integer.toBinaryString(12);
        String z = Integer.toBinaryString(83);

        while (n  < 30) {
            n ++;
            y = Integer.toBinaryString(n);
            System.out.println("엔" + n);
            System.out.println(y);
            System.out.println(y.split("1").length);
            System.out.println(Arrays.toString(y.split("1")));
            System.out.println(y.split("1",-1).length);
            System.out.println(Arrays.toString(y.split("1",-1)));
        }
        assertThat(NewBigNum.solution(78)).isEqualTo(83);
        assertThat(NewBigNum.solution(15)).isEqualTo(23);
    }

    @Test
    public void name() {
        String a = "W 4s d2a3";
        char[] b2 = a.toUpperCase().toCharArray();
        StringBuffer sb = new StringBuffer();
        int num = 0;
        for (char c : b2) {
            if (c > 47 && c < 58) {
                num += c - 48;
            } else if (c != 32){
                sb.append(c);
            }
        }
        System.out.println(num);
        sb.append(num);
        System.out.println(Arrays.toString(b2));
        System.out.println(sb.toString());
    }
}
