package study.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class QuickSortTest {

    @Test
    public void name() {
        int[] a = {2,1,3,5,6,4};
        QuickSort.quickSort(a,0, 6 -1);
        System.out.println(Arrays.toString(a));

    }
}