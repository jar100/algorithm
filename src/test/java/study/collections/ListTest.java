package study.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

    @Test(expected = UnsupportedOperationException.class)
    public void immutableList() {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        Collections.rotate(fruits, 1);
        Collections.fill(fruits, "Apple");
        System.out.println(fruits.toString());


        fruits = Collections.unmodifiableList(fruits);

        //수정해서 익셉션
        fruits.set(1, "bbbbb");

        System.out.println(fruits.toString());

    }

    @Test
    public void indexOfSubList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,3,4,5));

        int first = Collections.indexOfSubList(list,new ArrayList<>(Arrays.asList(3,4,5)));
        int last = Collections.lastIndexOfSubList(list,new ArrayList<>(Arrays.asList(3,4,5)));
        System.out.println(first);
        System.out.println(last);
        System.out.println(list.toString());
    }

    @Test
    public void immutableList2() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        //수정은 가능 불변이 아니다
        fruits.set(1, "bbbbb");

        System.out.println(fruits.toString());

    }


    @Test(expected = UnsupportedOperationException.class)
    public void immutableList3() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        //삽입은 불가능
        fruits.add("bbbbb");

        System.out.println(fruits.toString());

    }
}
