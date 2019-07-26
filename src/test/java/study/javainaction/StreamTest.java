package study.javainaction;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

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





}
