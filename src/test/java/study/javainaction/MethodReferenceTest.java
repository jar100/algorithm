package study.javainaction;

import org.junit.Test;
import study.collections.Car;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceTest {
    @Test
    public void whatIsMethodReference() {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });


        /// to

        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
    }



    @Test
    public void constructReferenceTest() {
        Function<Integer, Car> carFunction = Car::new;
        Car car1 = carFunction.apply(1);

        List<Integer> number = new ArrayList<>(Arrays.asList(3, 4, 5, 7, 10, 15));
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("레드",3);
        numbers.put("블루",5);
        numbers.put("그린",7);
        numbers.put("블랙",15);


        List<Car> cars = list(number,Car::new);
        List<Car> cars1 = map(numbers,Car::new);
        System.out.println(cars);
    }

    private List<Car> list(List<Integer> number, Function<Integer, Car> carFunction) {
        List<Car> result = new ArrayList<>();
        for (Integer integer : number) {
            result.add(carFunction.apply(integer));
        }
        return result;
    }

    private List<Car> map(Map<String,Integer> numbers, BiFunction<String,Integer,Car> carBiFunction) {
        List<Car> result = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : numbers.entrySet()) {
            result.add(carBiFunction.apply(stringIntegerEntry.getKey(),stringIntegerEntry.getValue()));
        }
        return result;
    }


    @Test
    public void sortTest() {
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("레드",3);
        numbers.put("블루",15);
        numbers.put("그린",2);
        numbers.put("블랙",15);
        numbers.put("화이트",17);


        List<Car> list = map(numbers,Car::new);


        list.sort(Comparator.comparing(Car::getNumber));
        System.out.println(list);

        list.sort(Comparator.comparing(Car::getNumber).reversed());
        System.out.println(list);
    }
}
