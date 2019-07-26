package study.javainaction;

import org.junit.Before;
import org.junit.Test;
import study.collections.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest {
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
    public void whatIsLambda() {
        Comparator<Car> byNumber = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getNumber(), o2.getNumber());
            }
        };

        //to lambda
        Comparator<Car> byNumber2 = (o1, o2) -> Integer.compare(o1.getNumber(), o2.getNumber());


        //to methodReference
        Comparator<Car> byNumber3 = Comparator.comparingInt(Car::getNumber);


    }

    @Test
    public void whyUseLambda() {


        List<Dish> meatTypeMenu= filter(menu, dish -> dish.getType() == Dish.Type.MEAT);


        List<Dish> biggerThan300Calories = filter(menu, new Predicate<Dish>() {
            @Override
            public boolean test(Dish dish) {
                return dish.getCalories() > 300;
            }
        });



        List<Dish> biggerThan400Calories = filter(menu, (dish) -> dish.getCalories() > 400);
        System.out.println(biggerThan400Calories);

    }

    private <T> List<T> filter(List<T> inventory, Predicate<T> o) {
        List<T> newInventory = new ArrayList<>();
        for (T t : inventory) {
            if (o.test(t)) {
                newInventory.add(t);
            }
        }
        return newInventory;
    }


    private <T> boolean compareToCalories(T target, T other) {
        return target.equals(other) ;
    }

    @Test
    public void useLocalVariable() {
        int num = 333;

        Runnable r = () -> System.out.println(num);

//        num = 4444;
        // 안된다
    }





}
