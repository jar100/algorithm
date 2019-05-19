package study.strategy;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class hashCodeTest {

    @Test
    public void name() {

        TireStrategy tireStrategy = new TireStrategy() {
            @Override
            public void Accelerators() {
                System.out.println("aa");
            }

            @Override
            public void brake() {
                System.out.println("aaa");
            }
        };


        Car a1 = new Car("red", tireStrategy);

        Car a2 = new Car("red", tireStrategy);

        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        Set<Car> a = new HashSet<>();
        a.add(a1);
        a.add(a2);

        for (Car car : a) {
            System.out.println(car);
        }
    }
}