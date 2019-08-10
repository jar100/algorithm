package study.javainaction;

import org.junit.Test;

import java.util.function.Function;

public class CloserTest {

    private static Function<String, Integer> function() {
        int a = 100;

        return new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s) * a;
            }
        };
    }


    //아래는 람다
    private static Function<String ,Integer> function2(){
        int a = 100;

        return s -> Integer.parseInt(s) * a;
    }


    @Test
    public void name() {
        Function<String, Integer> function = function();
        Integer apply = function.apply("3");
        System.out.println(apply);



    }



}
