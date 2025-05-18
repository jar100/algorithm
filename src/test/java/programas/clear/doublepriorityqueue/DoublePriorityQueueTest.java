package programas.clear.doublepriorityqueue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DoublePriorityQueueTest {
    @Test
    public void name() {
        DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();

        assertThat(doublePriorityQueue.solution(new String[]{"I 16","D 1"})).isEqualTo(new int[]{0,0});
    }

    @Test
    public void parseTest() {
        String a = "-1";
        int b = Integer.parseInt(a);

        System.out.println(b);
    }
}