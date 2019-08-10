package study.javainaction;

import org.junit.Test;
import study.collections.Car;

public class EffectivlyFinalTest {

    @Test
    public void name() {
        final Car newCar = new Car(111);


        set(newCar);

//        newCar = new Car(12454);

        System.out.println(newCar);
    }

    public void set(Car car) {
        car = new Car(123);
    }

}
