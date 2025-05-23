package study.collections;

import org.junit.Test;
import programas.BaseTest;

import java.util.*;

public class NavigableMapTest extends BaseTest {

    @Test
    public void whatIsNavigableMap() {

        NavigableMap map = new TreeMap();
        Integer[] ab = new Integer[30];
        List<Integer> a = new ArrayList<>(Arrays.asList(ab));

        System.out.println(a.size());
        map.put(200, "OK");
        map.put(100, "Continue");

        map.put(400, "Bad Request");
        map.put(401, "Unauthorized");

        map.put(500, "Internal Server Error");
        map.put(501, "Not Implemented");


        System.out.println(map.toString());

        // 199 보다 큰값 같은건 제외
        softly.assertThat(map.higherKey(199)).isEqualTo(200);

        // 199 가 천장이다. 이것 보다 작거나 같은 값.
        softly.assertThat(map.floorKey(199)).isEqualTo(100);

        // 199 가 바닥이다. 이것 보다 크거나 같은 값.
        softly.assertThat(map.ceilingKey(199)).isEqualTo(200);

        // 199 보다 작은값.
        softly.assertThat(map.lowerKey(199)).isEqualTo(100);

    }
}
