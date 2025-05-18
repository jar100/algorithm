package codility.checkunpair;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckUnpairTest {
    CheckUnpair checkUnpair = new CheckUnpair();


    @Test
    public void name() {
        assertThat(checkUnpair.solution(new int[] {9, 3, 9, 3, 9, 7, 9})).isEqualTo(7);
    }
}