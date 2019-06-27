package generics;

import org.junit.Test;
import programas.BaseTest;

import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.*;

public class GenericsStudyTest extends BaseTest {
    GenericsStudy genericsStudy = new GenericsStudy();

    @Test
    public void name() {
        genericsStudy.genericsInts.add(3);
        System.out.println(genericsStudy.genericsInts.toString());
    }

    @Test
    public void generics_before_after() {

        // 제네릭이 등장하기 이전
        List words2 = new ArrayList();
        words2.add("Hello ");
        words2.add("world!");
        String s2 = ((String)words2.get(0))+((String)words2.get(1));
        softly.assertThat(s2).isEqualTo("Hello world!");

        // 제네릭이 등장한 후
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0)+words.get(1);
        softly.assertThat(s).isEqualTo("Hello world!");

        toList(words);
        toList(new int[]{1,2,3,4});
    }

    public <T> List<T> toList(T... arr) {
        List<T> list = new ArrayList<T>(); for (T elt : arr) list.add(elt); return list;
    }


    @Test
    public void extneds_wildcard() {
        List<Integer> ints = new ArrayList<Integer>(); ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        double dbl = sum(nums); // ok
        // nums.add(3.14); // compile-time error
    }

    public static double sum(Collection<? extends Number> nums) { double s = 0.0;
        for (Number num : nums) s += num.doubleValue();
        return s;
    }

    @Test
    public void super_wildcard() {
        List<Object> objs = new ArrayList<Object>(); objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3); // ok
        //double dbl = sum(ints); // compile-time error

    }

    @Test
    public void arry_sub() {
        Integer[] a = new Integer[]{1,2,3,4};
        Number[] b = a;
       // b[3] = 3.2;
        for (Number number : b) {
            System.out.println(number);
        }
        System.out.println(max(Arrays.asList(a)));
    }

    public static <T extends Comparable<T>> T max(Collection<T> coll) {
        Iterator<T> it = coll.iterator();
        T candidate = it.next();
        while (it.hasNext()) {
            T elt = it.next();
            if (candidate.compareTo(elt) < 0) candidate = elt; }
        return candidate;
    }


    @Test
    public void list_compareTo() {
        List<Object> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(3.15);

        System.out.println((int)numbers.get(0) + 5);
    }

    @Test
    public void reflection() {
        for (Method m : Integer.class.getMethods()) if (m.getName().equals("compareTo"))
            System.out.println(m.toGenericString());
    }
}