package study.generics;

import org.junit.Test;
import programas.BaseTest;

import java.util.*;

public class GenericsStudyTest extends BaseTest {
    GenericsStudy genericsStudy = new GenericsStudy();

    @Test
    public void name() {
        genericsStudy.genericsInts.add(3);
        System.out.println(genericsStudy.genericsInts.toString());
    }

    @Test
    public void genericsBeforeAfter() {

        // 제네릭이 등장하기 이전
        List words2 = new ArrayList();
        words2.add("Hello ");
        words2.add("world!");
        String s2 = ((String) words2.get(0)) + ((String) words2.get(1));
        softly.assertThat(s2).isEqualTo("Hello world!");

        // 제네릭이 등장한 후
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        softly.assertThat(s).isEqualTo("Hello world!");

        toList(words);
        toList(new int[]{1, 2, 3, 4});

    }

    public <T> List<T> toList(T... arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr) {
            list.add(elt);
        }

        return list;
    }


    // List<Object> List<?> 의 차이는?

    @Test
    public void whatIsDifferentObjectTypeAndUnboundedWildcardType() {
        // Integer 는 Object 의 subtype 이지만 List<Integer> 는 List<Object> 의 subtype 이 아니다.
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Number> numbers = new ArrayList<>(Arrays.asList(1.2, 1, 3, 45));
        List<Object> objects = new ArrayList<>(Arrays.asList(1.2, 1, 3, 45));
        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        // List<Integer> 가 List<Object> 의 subtype 이 아니기 때문에 동작이 안된다.
//        printListOfObjectType(integerList);
//        printListOfObjectType(numbers);
        printListOfObjectType(objects);

        // List<Object> 와 List<Integer> 같은 모든 concrete type A, List<A> 는  List<?> 의 subtype 이다.
        // unbounded wildcard 를 사용하면 둘다 complie errer 가 발생하지 않고 잘 동작 된다.
        printListOfUnboundWildcardType(integerList);
        printListOfUnboundWildcardType(numbers);
        printListOfUnboundWildcardType(objects);

        // print 와 같이 타입이 어떤것 이든 상관 없이 List의 method 만 사용할 땐 Unbounded Wildcard type 을 사용하면 다형성 만족 시킬 수 있다.

        // bouned wildcard 사용 예 extends A 라는 조건을 주면 A의 method 를 사용할 수 있다.
        printListOfBounedWildcardType(integerList, 3);
        printListOfBounedWildcardType(strings, "b");
    }

    public void printListOfObjectType(List<Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void printListOfUnboundWildcardType(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public <T> void printListOfBounedWildcardType(List<? extends Comparable<T>> list, T t) {
        for (Comparable<T> tComparable : list) {
            if (tComparable.compareTo(t) > 0) {
                System.out.println(tComparable);
            }
        }
    }

    @Test
    public void objectTypeAndWildcardTypeSetList() {
        // List<Object> 는 set으로 object를 집어 넣을 수 있다.
        // List<?> 는 set으로 null 밖에 넣을 수 없다.
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Number> numbers = new ArrayList<>(Arrays.asList(1.2, 1, 3, 45));
        List<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 3, "dfdsf"));

        System.out.println("--------------------");
        setObjectType(objects, "setObject");
//        setObjectType(numbers,3);
//        setObjectType(integerList,3);

        System.out.println("--------------------");
        setUnboundWildcardType(integerList, 3);
        setUnboundWildcardType(numbers, 2);
        setUnboundWildcardType(objects, 23);

        // BoundedWildcard set
        System.out.println("--------------------");
        setBoundWildcardType(integerList, 3);
        setBoundWildcardType(numbers, 2);
        setBoundWildcardType(objects, "boundedWildcardType");
    }

    public void setObjectType(List<Object> list, Object item) {
        list.add(item);
        list.set(0, item);
        System.out.println(list);
    }

    public <T> void setUnboundWildcardType(List<?> list, T item) {
//        list.set(0, item);
        list.add(null);
        list.set(0, null);
        System.out.println(list);
    }

    public <T> void setBoundWildcardType(List<? super T> list, T item) {
        list.set(0, item);
        list.add(item);
        System.out.println(list);
    }

    ///////////////////


    @Test
    public void getListTest() {
        List<String> strings = new ArrayList<>();
        //strings.add((Object)"asdfa");

    }


    // super 를 extends 했을 때 안됬던 이유 자식 리스트긴 한데 무엇인지 정확히 몰라서
    // ex) List<? extends String> 는 String의 subtype 중 하나인데 무엇인지 정확하지 않다 그래서 스트링을 집어 넣을 수 없다.
    public List<? super String> getList(List<? super String>list){
        list.add("adsfasd");
        list.add(null);
        return list;
    }




    public static <T extends Number> void copy1(List<? super Number> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    @Test
    public void copy_extends_to_super() {
        //상위타입에다 자식타입을 넣을 수 있다.
        List<Object> superList = Arrays.asList("123", 12, "3333", 12.54);
        List<Integer> extendsList = Arrays.asList(1, 2, 3);
        List<Number> tList = Arrays.asList(12, 3, 4.23);

        copy1(superList, tList);
        copy1(superList, extendsList);


        for (Object o : superList) {
            System.out.println(o);
        }
    }

    public static <T> void copy2(List<T> dst, List<T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    @Test
    public void copy_t_to_t() {
        // 같은 타입만 된다.
        List<Integer> superList = Arrays.asList(5, 12, 5, 15);
        List<Integer> extendsList = Arrays.asList(1, 2, 3);

        copy2(superList, extendsList);

        for (Object o : superList) {
            System.out.println(o);
        }
    }

    public static <T> void copy3(List<T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }

        // T answer = dst.get(0); 가능
    }

    @Test
    public void copy_xtends_to_t() {
        //같은타입과 자식타입이 set 된다.
        List<Number> tList = Arrays.asList(5.33, 12, 5, 15.32);
        List<Number> tList2 = Arrays.asList(5.33, 12, 5, 15.32);
        List<Integer> extendsList = Arrays.asList(1, 2, 3);

        copy3(tList, tList2);
        copy3(tList, extendsList);

        for (Number number : tList) {
            System.out.println(number);
        }
    }

    public static <T> void copy4(List<? super T> dst, List<T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }

        //dst get 할 수 없다
    }

    @Test
    public void copy_t_to_super() {
        // 같은 타입과 자식 타입이 set된다.
        List<Number> tList = Arrays.asList(5.33, 12, 5, 15.32);
        List<Integer> extendsList = Arrays.asList(1, 2, 3);
        List<Integer> extendsList2 = Arrays.asList(1, 2, 3);

        copy4(tList, extendsList);
        copy4(extendsList2, extendsList);


        for (Number number : tList) {
            System.out.println(number);
        }
    }


}