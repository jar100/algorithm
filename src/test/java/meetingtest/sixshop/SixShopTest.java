package meetingtest.sixshop;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixShopTest {
    SixShop sixShop = new SixShop();

    @Test
    public void name() {
        List<String> a = new ArrayList<>();
        a.add("abc");
        a.add("bbbbbb");
        a.add("abcdefghijklnmopqrstuvwxyz");
        SixShop.isPangram(a);
    }

    @Test
    public void name1() {
        List<String> a = new ArrayList<>();
        a.add("}][}}(}][))]");
        a.add("[](){()}");
        a.add("()");
        a.add("({}([][]))[]()");
        a.add("{)[](}]}]}))}(())(");
        a.add("([[)");





        System.out.println(Arrays.toString(SixShop.braces2(a.toArray(new String[0]))));

    }

    @Test
    public void name3() {
        List<Integer> a = new ArrayList<>();
        a.add(-5);
        a.add(4);
        a.add(-2);
        a.add(3);
        a.add(1);
        a.add(-1);
        a.add(-6);
        a.add(-1);
        a.add(0);
        a.add(5);

        System.out.println(SixShop.minPower(a));

    }

    @Test
    public void name4() {
        
    }
}