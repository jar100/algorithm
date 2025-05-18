package study.javainaction;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import study.collections.Car;
import study.collections.Tire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class MappingTest {
    public static List<Dish> menu;

    @BeforeAll
    public static void setMenu() {
        menu = new ArrayList<>();
        menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("beef", false, 700, Dish.Type.MEAT));
        menu.add(new Dish("chicken", false, 400, Dish.Type.MEAT));
        menu.add(new Dish("french fries", true, 530, Dish.Type.OTHER));
        menu.add(new Dish("rice", true, 350, Dish.Type.OTHER));
        menu.add(new Dish("season fruit", true, 120, Dish.Type.OTHER));
        menu.add(new Dish("pizza", true, 550, Dish.Type.OTHER));
        menu.add(new Dish("prawns", false, 300, Dish.Type.FISH));
        menu.add(new Dish("salmon", false, 450, Dish.Type.FISH));
    }

    @Test
    public void map() {
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println(dishNames);



    }

    @Test
    public void flatMap() {


        List<String> words = Arrays.asList("Hello", "World");

        // map
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // flatMap
        words.stream()
                .flatMap((String line) -> Arrays.stream(line.split("")))
                .forEach(System.out::println);



        Optional<String> a = Optional.of("asd");

        Optional<Optional<String>> b = a.map(Optional::of);

        final Optional<String[]> strings = a.flatMap(c -> Optional.of(c.split("")));
        final Optional<Optional<String[]>> strings1 = a.map(c -> Optional.of(c.split("")));

        Optional<Optional<Optional<String>>> c = b.map(Optional::of);
        Optional<Optional<Optional<Optional<String>>>> d = Optional.of(c);
        System.out.println(d);
        System.out.println(d.flatMap(Optional::get));
    }

    @Test
    public void cartest() {
        Car newCar = new Car("붕붕", 1,new Tire("스노우 타이어"));
        Car nullCar = new Car("붕붕", 1,null);

        final Optional<String> s =
                Optional.of(nullCar).map(Car::getTire)
                        .map(Tire::getType);
        System.out.println(s);

        final Optional<String> s2 =
                Optional.of(newCar).flatMap(Car::getOptionalTire)
                        .map(Tire::getType);
        System.out.println(s2);
    }

    @Test
    public void listContainsTest() {
        Car newCar = new Car("붕붕", 1,new Tire("스노우 타이어"));
        Car nullCar = new Car("붕붕", 2,null);

        List<Car> cars = new ArrayList<>();
        cars.add(newCar);
        cars.add(nullCar);

        System.out.println(cars.contains(new Car(1)));



    }

    @Test
    public void other() {
        // flatMap
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = Arrays.asList(6, 7, 8);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap((Integer i) -> numbers2.stream()
                                .map((Integer j) -> new int[]{i, j})
                        )
                        .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                        .collect(toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }

}
