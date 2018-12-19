package programas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void tests() {
        ArrayList<String> a = new ArrayList<>();
        a.add("ggg");
        a.add("qqq");
        Iterator iteratorA = a.iterator();
        System.out.println(iteratorA.hasNext());
        System.out.println(iteratorA.next());
        System.out.println(iteratorA.hasNext());
        System.out.println(iteratorA.next());
        System.out.println(iteratorA.hasNext());

        // iterator 는 포문을 사용하지 않고 포문을 돌리는걸로 생각하면 될거같다.


    }
}
