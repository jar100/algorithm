package icecream;

import org.junit.Test;

public class IceCream1Test {
    IceCream1 iceCream1 = new IceCream1();

    @Test
    public void name1() {
        iceCream1.solution(new int[]{101, 2, 3, 4, 102, 3, 1, 2, 3, 101, 1, 5});
    }

}