package study.spring_applitcatecontext;

import org.junit.jupiter.api.Test;

import java.util.List;

public class testCheck {
    @Test
    void name() {
        final List<Integer> of = List.of(1, 2, 3, 4, 5, 6);
        for (Integer integer : of) {
            try {
                sAdd(integer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    void sAdd(int integer) {
        if (integer == 3) {
            System.out.println("ok");
        }else {
            throw new RuntimeException();
        }
    }
}
