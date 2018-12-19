package programas;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class KakaoTest {

    @Test
    public void test() {
        int[] a = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = {3,4,2,1,5};
        int[] b = {2, 1};
        System.out.println("Asd");
        System.out.println(Arrays.toString(KakaoTest2.solution(5, result)));
    }

    @Test
    public void test2() {
        int[] a = {1,1,1,1};
        int[] result = {4,1,2,3};
        assertThat(KakaoTest2.solution(4,a)).isEqualTo(result);
    }
}
