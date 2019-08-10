package study.javainaction;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamTest {
    @Test
    public void name() {
        class A implements Runnable {
            Integer a = 0;
            int b;
            void sum(int number) {
                this.b += number;
            }

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("dddddd");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        A object = new A();

// 공유변수 접근.

        int[] dataSet = new int[100001];
        for (int i = 0; i < 100000; i++) {
            dataSet[i] = i;
        }

        System.out.println("스레드풀의 개수"+Runtime.getRuntime().availableProcessors());
        IntStream.of(dataSet).boxed().parallel().peek(System.out::println).forEach(object::sum);
    }

    @Test
    public void sort() {
        List<Integer> a =
        Stream.of(1,5,3,2,5,34,6,5,7,989,7,55,46,345,241,23)
                .parallel().sorted(Integer::compareTo).collect(Collectors.toList());

        System.out.println(a);
    }


    @Test
    public void Limit() {
        List<Integer> a =
                Stream.of(1,5,3,2,5,34,6,5,7,989,7,55,46,345,241,23)
                        .parallel()
                        .peek(System.out::println)
                        .sorted(Integer::compareTo)
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(a);
    }



    @Test
    public void completableFuture() throws ExecutionException, InterruptedException {
        List<AsyncShop> shops = new ArrayList<>(Arrays.asList(
                new AsyncShop("BestShop")
                ,new AsyncShop("shop1")
                ,new AsyncShop("shop2")
                ,new AsyncShop("shop3")
                ,new AsyncShop("shop4")
                ,new AsyncShop("shop5")
                ,new AsyncShop("shop6")

        ));

        final List<CompletableFuture<Double>> newList = shops.parallelStream()
                .map(asyncShop -> asyncShop.getPrice("myPhone"))
                .collect(Collectors.toList());
        System.out.println(newList);


        final List<Double> collect = newList.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(collect);
        Thread.sleep(111111111);
    }


    @Test
    public void completableFuture2() throws ExecutionException, InterruptedException {
        List<AsyncShop> shops = new ArrayList<>(Arrays.asList(
                new AsyncShop("BestShop")
                ,new AsyncShop("shop1")
                ,new AsyncShop("shop2")
                ,new AsyncShop("shop3")
                ,new AsyncShop("shop4")
                ,new AsyncShop("shop5")
                ,new AsyncShop("shop6")

        ));

        final List<Future<Double>> newList = shops.stream()
                .map(asyncShop -> asyncShop.getPrice("myPhone"))
                .collect(Collectors.toList());
        System.out.println(newList);

        for (Future<Double> doubleFuture : newList) {
            System.out.println(doubleFuture.get());
        }
        Thread.sleep(111111111);
    }
}
