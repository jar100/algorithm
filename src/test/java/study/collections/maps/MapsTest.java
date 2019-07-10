package study.collections.maps;

import org.junit.Test;
import programas.BaseTest;

import java.util.*;

public class MapsTest extends BaseTest {


    @Test
    public void linkedHashMap() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();


    }


    @Test
    public void hashMap() {
        HashMap<Integer, String> map = new HashMap<>();

    }


    @Test
    public void weakHashMap() {
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        // 메모리가 남아도 gc 의 대상이 된다.
        HashMap<Integer, String> map1 = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;
        Integer key3 = 3000;
        Integer key4 = 4000;

        map.put(key1, "test a");
        map.put(key2, "test b");


        map1.put(key3, "test a");
        map1.put(key4, "test b");

        key1 = null;
        key3 = null;
        key4 = null;
        System.gc();  //강제 Garbage Collection
        System.out.println(map1.toString());
        System.out.println(map.toString());
    }

    @Test
    public void weakHashMapWithString() {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        // 메모리가 남아도 gc 의 대상이 된다.

        // 힙영역에 존
        String key1 = new String("1000");
        // 리터럴에의해 생성
        String key2 = "2000";

        map.put(key1, "test a");
        map.put(key2, "test b");

        key1 = null;
        key2 = null;
        System.gc();  //강제 Garbage Collection
        System.out.println(map.toString());
    }


}
