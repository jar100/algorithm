package codility.checkunpair;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class CheckUnpairTest extends BaseTest {
    CheckUnpair checkUnpair = new CheckUnpair();


    @Test
    public void name() {
        softly.assertThat(checkUnpair.solution(new int[] {9, 3, 9, 3, 9, 7, 9})).isEqualTo(7);
    }
}