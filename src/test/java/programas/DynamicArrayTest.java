package programas;

import org.junit.Test;
import programas.clear.myarraylist.PeterArrayList;

import static org.junit.Assert.assertEquals;

public class DynamicArrayTest {
    @Test
    public void init() {
        PeterArrayList<Integer> da = new PeterArrayList<>();
        assertEquals(0, da.size());

        int size = 15;
        PeterArrayList<Integer> da2 = new PeterArrayList<>(size);
        assertEquals(size, da2.size());
    
        size = 5;
        PeterArrayList<Integer> da3 = new PeterArrayList<>(size);
        assertEquals(size, da3.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWithException() {
        PeterArrayList<Integer> da = new PeterArrayList<>();
        da.get(11);
    }

    @Test
    public void get() {
        PeterArrayList<Integer> da = new PeterArrayList<>();
        da.set(0, 1);
        assertEquals((Integer)1, da.get(0));
    }

    @Test
    public void set() {
        PeterArrayList<Integer> da = new PeterArrayList<>();
        da.set(0, 1);
        assertEquals((Integer)1, da.get(0));

        da.set(1, 1);
        assertEquals((Integer)1, da.get(1));

        da.set(10, 5);
        assertEquals((Integer)5, da.get(10));
        assertEquals(11, da.size());

        PeterArrayList<String> da2 = new PeterArrayList<>();
        da2.set(0, "Hello");
        assertEquals("Hello", da2.get(0));
    }

    @Test
    public void remove() {
        PeterArrayList<Integer> da = new PeterArrayList<>();
        da.set(0, 0);
        da.set(1, 1);
        da.set(2, 2);
        da.set(3, 3);
        da.set(4, 4);
        da.set(5, 5);
        assertEquals(6, da.size());
        assertEquals("[0, 1, 2, 3, 4, 5]", da.toString());
        System.out.println(da);

        assertEquals((Integer)3, da.remove(3));
        System.out.println(da);
        assertEquals(5, da.size());
        assertEquals("[0, 1, 2, 4, 5]", da.toString());
    }



}