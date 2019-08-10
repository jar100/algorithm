package study.javainaction;

import org.junit.Test;
import study.collections.Car;

import java.util.Optional;

public class OptionalTest {
    @Test
    public void emptyWithNullObject() {
        Car newCar = new Car("1423", 4);
        Optional<Car> o = Optional.of(newCar);
        System.out.println(o.orElse(Car.EMPTY));

        o = Optional.empty();
        System.out.println(o.orElse(Car.EMPTY));
    }

    @Test
    public void nullTest() {
        Car newCar = new Car("1423", 4);

        if (newCar == null) {
            throw new RuntimeException("널이다.");
        }

        // with Optional
        Optional<Car> o = Optional.of(newCar);
        o.orElseThrow(() ->new RuntimeException("널이다."));

    }

    @Test
    public void flatMap() {
        final Person person = new Person("백경훈");
        Optional<Person> optionalPerson = Optional.of(person);
        Optional<Integer> optionalCar = optionalPerson
                .flatMap(Person::getCar)
//                .map(Person::getCar)
                .map(Car::getNumber);

        System.out.println(optionalCar);
    }

    class Person {
        private String name;
        private Optional<Car> car = Optional.of(new Car("123",123));

        public Person(final String name) {
            this.name = name;
        }

        public Optional<Car> getCar() {
            return car;
        }

        public void setCar(final Optional<Car> car) {
            this.car = car;
        }
    }
}
