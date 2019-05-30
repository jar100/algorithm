package study.sort;

import org.junit.Test;
import programas.BaseTest;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest extends BaseTest {

    @Test
    public void name() {
        int[] a = {2,1,3,5,6,4};
        QuickSort.quickSort(a,0, 6 -1);
        System.out.println(Arrays.toString(a));

    }
}