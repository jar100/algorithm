package study.javainaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Closure2Test {
    private Int b = new Int(2);

    private Int getB() {
        return this.b;
    }

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    public void doTest() {
        //System.out.println(calculate(list.stream(), 3).collect(Collectors.toList()));

        System.out.println(calculate(list.stream(), new Int(3)).collect(Collectors.toList()));
    }

    private Stream<String> calculate(Stream<Integer> stream, Int a) {
        b.setValue(3);
        a.setValue(10); //함수내에서 사용되는 a의 값 value는 변경될 수 있다. 이러면 side-effect가 발생할 수 있다.
        return stream.map(t -> String.valueOf(t * a.value + b.value));
    }

    @Test
    public void name() {
        doTest();

    }

    private static class Int {
        public int value;

        public Int(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
