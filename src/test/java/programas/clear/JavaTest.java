package programas.clear;

import org.junit.Test;
import programas.FindBigSquare;
import programas.clear.Fibonacci;
import programas.clear.MaximumOrMinimum;
import programas.clear.Phonekemon;
import programas.clear.programas2016;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaTest {
    @Test
    public void phonekemonTest() {
        int[] nums1 = {3,1,2,3};
        assertThat(Phonekemon.solution(nums1)).isEqualTo(2);
        int[] nums2 = {3,3,3,2,2,4};
        assertThat(Phonekemon.solution(nums2)).isEqualTo(3);
        int[] nums3 = {3,3,3,2,2,2};
        assertThat(Phonekemon.solution(nums3)).isEqualTo(2);
    }

    @Test
    public void fiboequals() {
        int n = 5;
        assertThat(Fibonacci.fibo(5)).isEqualTo(5);

    }

    @Test
    public void test2() {
        String a = programas2016.solution(5,24);
        System.out.println(a);
        assertThat(a).isEqualTo("TUE");

    }

    @Test
    public void test3() {
        int[] a = {5, 9, 7, 10	};
        int[] result = FindBigSquare.solution(a, 5);
        System.out.println(Arrays.toString(result));

    }
    @Test
    public void foreachTest() {
        int[] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Test
    public void equalsTest() {
        int a = 0;
        int b = 0;
        String a1 = "gg";
        String b1 = "gg";
        String c1 = new String("gg");
        if (a == b) {
            System.out.println("true");
        }
        if (a1 == b1) {
            System.out.println("true");
        }
        if (a1.equals(b1)) {
            System.out.println("true2");
        }
        if (a1 == c1) {
            System.out.printf("true3");
        }
        if (a1.equals(c1)) {
            System.out.println("true4");
        }
    }

    @Test
    public void maxNumOrMinNum() {
        String s = "5 -1 -2 3 4 -2";
        assertThat(MaximumOrMinimum.solution(s)).isEqualTo("-2 5");
        assertThat(MaximumOrMinimum.solution("-1 -2 -3 -4")).isEqualTo("-4 -1");
        assertThat(MaximumOrMinimum.solution("-1 -1")).isEqualTo("-1 -1");
    }
    @Test
    public void fibonacciTest() {
        System.out.println(Fibonacci.fibo(4));
        assertThat(Fibonacci.solution(3)).isEqualTo(2);
        assertThat(Fibonacci.solution(5)).isEqualTo(5);
    }
}
