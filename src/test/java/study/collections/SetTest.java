package study.collections;

import org.junit.Test;
import programas.BaseTest;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetTest extends BaseTest {


    @Test
    public void hashSet() {
        // 셋은 내부에 map을 가지고 구현 되있다.
        // map의 key 만 사용하고 value 는 더미데이터를 그냥 집어넣는다. map.put(e, new Object());
        Set<Integer> set = new HashSet<>();
    }

    @Test
    public void SortedSet() {

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }
        System.out.println(sortedSet);

        // 역순 출력은? 출력하는 메소드가 없어 다시 set 을 생성하는 식으로 해야한다.
    }

    @Test
    public void SortedSetWithHeadSet() {
        // 처음부터 파라미터 원소 이전까지 쫘르르륵
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }

        System.out.println(sortedSet.headSet(5));
    }

    @Test
    public void SortedSetWithTailSet() {
        // 파라미터 원소 부터 쫘르륵

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }


        System.out.println(sortedSet.toString());
        System.out.println(sortedSet.tailSet(5));
    }

    @Test
    public void sortedSetWhyNonComparable() {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        //sortred 에 적제되는 원소 <E> 를 <E extends comparable> 정의 안한 이유
        /////////////
        PriorityQueue<Car> priorityQueue = new PriorityQueue<>(new Comparator<Car>() {

            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getNumber() > o2.getNumber()) {
                    return 1;
                } else if (o1.getNumber() < o2.getNumber()) {
                    return -1;
                }
                return 0;
            }
        });

        Car a = new Car("123", 3);
        Car b = new Car("1234", 5);
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(4);

//        sortedSet.add(b);
        priorityQueue.add(a);
        priorityQueue.add(b);
        System.out.println(priorityQueue.toString());
        System.out.println(sortedSet.toString());
    }

    @Test
    public void SortedSetWithSubSet() {
        // 파라미터 원소1 부터 원소2 이전까지 쫘르륵

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }

        System.out.println(sortedSet.subSet(2, 5));
    }

    // NavigableSet

    @Test
    public void NavigableSetWhiteDescendingIterator() {

        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }
        System.out.println(sortedSet);

        SortedSet<Integer> newSet = sortedSet.descendingSet();
        System.out.println(newSet);
    }

    @Test
    public void NavigableSetWithCoiling() {
        // 파라미터 값 이상인 값중 가장 작은 값을 호출 한다.
        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }
        System.out.println(sortedSet);
        System.out.println(sortedSet.ceiling(40));
        System.out.println(sortedSet.ceiling(39));
    }

    @Test
    public void NavigableSetWithHigher() {
        // 파라미터 값 초과인 값중 가장 작은 값을 호출 한다.
        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }
        System.out.println(sortedSet);
        System.out.println(sortedSet.higher(40));
        System.out.println(sortedSet.higher(39));
    }

    @Test
    public void NavigableSetWithFloor() {
        // 파라미터 값 이하인 값중 가장 큰 값을 호출 한다.
        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }
        System.out.println(sortedSet);
        System.out.println(sortedSet.floor(40));
        System.out.println(sortedSet.floor(39));
    }

    @Test
    public void NavigableSetWithLower() {
        // 파라미터 값 미만인 값중 가장 큰 값을 호출 한다.
        NavigableSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i);
            sortedSet.add(i * 10);
        }
        System.out.println(sortedSet);
        System.out.println(sortedSet.lower(40));
        System.out.println(sortedSet.lower(30));
    }


    // concurrentSkipListSet


    @Test
    public void concurrentSkipListSetTest() {
        ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>();
        for (int i = 0; i < 10; i++) {
            skipListSet.add(i);
            skipListSet.add(i * 10);
        }

        for (Iterator it = skipListSet.iterator(); it.hasNext(); ) {

        }
    }
}
