package baekjun.clear.baek1015;

import org.junit.Test;
import programas.BaseTest;

public class Baek1015Test extends BaseTest {

    @Test
    public void solution() {
        Baek1015 baek1015 = new Baek1015();

        softly.assertThat(baek1015.solution(3, new int[]{2, 3, 1})).isEqualTo(new int[]{1, 2, 0});
        softly.assertThat(baek1015.solution(50,
                new int[]{
                        302, 251, 425, 720, 122, 441, 752, 229, 918,
                        44, 927, 728, 372, 82, 410, 46, 641, 499, 700,
                        929, 509, 901, 577, 770, 130, 643, 338, 571, 742, 78,
                        327, 64, 925, 147, 622, 197, 686, 474, 254, 877, 896,
                        623, 753, 583, 946, 740, 479, 498, 826, 724}
                )).isEqualTo(new int[]{12, 10, 17, 33, 5, 18, 38, 9, 45, 0,
                47, 35, 15, 4, 16, 1, 29, 22, 32,
                48, 23, 44, 25, 40, 6, 30, 14, 24,
                37, 3, 13, 2, 46, 7, 27, 8, 31, 19,
                11, 42, 43, 28, 39, 26, 49, 36, 20, 21, 41, 34 });


        softly.assertThat(baek1015.solution(5, new int[]{0, 0, 0, 0, 0})).isEqualTo(new int[]{1, 2, 0});

    }
}