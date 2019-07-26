package study.javainaction;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class MappingTest {
    public static List<Dish> menu;

    @Before
    public void setMenu() {
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
        // map
        List<String> words = Arrays.asList("Hello", "World");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);


        // map
        words.stream()
                .map((String line) -> Arrays.stream(line.split("")))
                .distinct()
                .forEach(System.out::println);

        // flatMap


        words.stream()
                .flatMap((String line) -> Arrays.stream(line.split("")))
                .distinct()
                .forEach(System.out::println);



        Optional<String> a = Optional.of("asd");

        Optional<Optional<String>> b = a.map(Optional::of);

        Optional<Optional<Optional<String>>> c = b.map(Optional::of);
        Optional<Optional<Optional<Optional<String>>>> d = Optional.of(c);
        System.out.println(d);
        System.out.println(d.flatMap(Optional::get));

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
