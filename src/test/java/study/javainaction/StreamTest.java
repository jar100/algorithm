package study.javainaction;

import org.junit.Before;
import org.junit.Test;
import study.collections.Car;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static List<Dish> menu;

    @Before
    public void setup() throws Exception {
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
        menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("pork", false, 800, Dish.Type.MEAT));

    }


    @Test
    public void stream() {
        List<String> threeHighCaloricDishNames =
                menu.stream()
                        .filter(dish -> dish.getCalories() > 300)
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(threeHighCaloricDishNames);

    }

    @Test
    public void stream1() {
        int count = 1;
      //  count++;
        List<String> threeHighCaloricDishNames =
                menu.parallelStream()
                        .filter(dish ->  {
                            System.out.println(count);
                            return        dish.getCalories() > 300;

                        })
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());


        List<String> nonStream = new ArrayList<>();
        for (Dish dish : menu) {
            if (count > 3) {
                break;
            }
            if (dish.getCalories() > 300) {
                nonStream.add(dish.getName());
//                count ++;
            }
        }

        System.out.println(nonStream);

        System.out.println(threeHighCaloricDishNames);

    }


    @Test
    public void streamQ() {
        menu.stream().filter(a -> a.getCalories() == 2011).sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());
    }

    @Test
    public void threadDefault() {
        // 자동계산
        System.out.println("스레드풀의 개수"+Runtime.getRuntime().availableProcessors());

        menu.parallelStream().forEach(index -> {
            System.out.println("Starting " + Thread.currentThread().getName()
                    + ", index=" + index + ", " + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) { }
        });
    }

    @Test
    public void threadTest() throws InterruptedException {
        ForkJoinPool forkjoinPool = new ForkJoinPool(5);

        forkjoinPool.submit(() -> {
            menu.parallelStream().forEach(index -> {
                System.out.println("Thread : " + Thread.currentThread().getName()
                        + ", index" + ", " + new Date());
                try{
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    System.out.println();
                }
            });
        });



        Thread.sleep(500000);
    }


    @Test
    public void peek() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("/////////////");


        List<Integer> values = Arrays.asList(1, 2, 3);
        long a = values.stream()
                .map(n -> n * 2)
                .filter((x) -> true)
                .peek(System.out::println)
                .count();
        System.out.println("카운트 : " + a);
    }

    @Test
    public void iterator() {
        Stream.iterate(0, n -> n + 1)
                .peek(System.out::println)
                .limit(5)
                .collect(Collectors.toList());
    }

    @Test
    public void iteratorWhenParallelStream() {
        final List<Integer> collect = Stream.iterate(0, n -> n + 1)
                .parallel()
                .peek(System.out::println)
                .limit(5)
                .collect(Collectors.toList());


        System.out.println(collect);
    }

    @Test
    public void distinct() {
        Stream.of(1,2,1,4,1,1,1,1,11111)
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    @Test
    public void curry() {
        Stream.of(1,2,1,4,1,1,1,1,11111)
                .map(multiplyCurry(2))
                .forEach(System.out::println);
    }

    private Function<Integer,Integer> multiplyCurry(int x) {
        return (Integer y) -> x * y;
    }

    @Test
    public void forEach() {
        menu.stream().distinct().peek(System.out::println).forEach(dish -> dish.setCalories(0));
        System.out.println("////////");
        menu.stream().distinct().peek(System.out::println).collect(Collectors.toList());
    }


    @Test
    public void streamWithEffectivelyFinal() {
        int count = 1;
        Car car = new Car("dsf", 3);
//          count = 3;
        List<String> threeHighCaloricDishNames =
                menu.parallelStream()
                        .filter(dish ->  {
                            System.out.println(count);
                            car.setNumber(15);
                            return dish.getCalories() > 300;

                        })
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());

        System.out.println(car.getNumber());
    }
}
