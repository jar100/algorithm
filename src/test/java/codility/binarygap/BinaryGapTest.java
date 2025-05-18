package codility.binarygap;

import org.junit.jupiter.api.Test;

public class BinaryGapTest {
    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void name() {
        System.out.println(Integer.toBinaryString(1041));
        System.out.println(binaryGap.solution(1041));
    }
}