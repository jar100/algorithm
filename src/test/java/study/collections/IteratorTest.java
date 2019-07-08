package study.collections;

import org.junit.Test;
import programas.BaseTest;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorTest extends BaseTest {

    @Test(expected = ConcurrentModificationException.class)
    public void concurrentException() {

        List<String> targetList = new ArrayList<>();
        targetList.add("a");
        targetList.add("b");
        targetList.add("b");
        targetList.add("c");
        targetList.add("d");

        for (Iterator<String> iter = targetList.iterator(); iter.hasNext(); ) {
            String a = iter.next();
            if (a.equals("b")) {
                targetList.remove(a);
            }
        }
    }


    @Test
    public void iteratorTestWithIterator() {

        List<String> targetList = new ArrayList<>();
        targetList.add("a");
        targetList.add("b");
        targetList.add("b");
        targetList.add("c");
        targetList.add("d");

        for (Iterator<String> iter = targetList.iterator(); iter.hasNext(); ) {
            String a = iter.next();
            if (a.equals("b")) {
                iter.remove();
            }
        }
        System.out.println(targetList);
    }

    @Test()
    public void iteratorTest3WithIndexFor() {
        // 이와 같이 fail-fast 방식이 아니라면 통과는 하지만 개발자가 예상하지 못한 오류가 발생할 수 있다.
        // 그래서 좀더 안전한 코드의 작성을 위해 변경이 일어나면 예외를 던저 개발자의 실수를 방지
        List<String> targetList = new ArrayList<>();
        targetList.add("a");
        targetList.add("b");
        targetList.add("b");
        targetList.add("c");
        targetList.add("d");

        for (int i = 0; i < targetList.size(); i++) {
            if (targetList.get(i) == "b") {
                targetList.remove(i);
            }
        }
        // for 문이 참고하는 i 의 값과 List 의 인덱스가 불일치가 생겨 문제 발생.
        // n 단골 문제 concurrent지만 단일 스레드여도 발생한다.
        System.out.println(targetList);
    }

    @Test
    public void iteratorTestWithSnapshotIterator() {

        List<String> targetList = new ArrayList<>();
        targetList.add("a");
        targetList.add("b");
        targetList.add("b");
        targetList.add("c");
        targetList.add("d");

        for (Iterator<String> iter = new ArrayList<>(targetList).iterator(); iter.hasNext(); ) {
            String a = iter.next();
            if (a.equals("b")) {
                targetList.remove(a);
            }
        }
        System.out.println(targetList);
    }



    @Test
    public void iteratorTestWithRemoveIf() {

        List<String> targetList = new ArrayList<String>();
        targetList.add("a");
        targetList.add("b");
        targetList.add("c");
        targetList.add("d");

        targetList.removeIf(a -> a.equals("b"));
        System.out.println(targetList);
    }
}
