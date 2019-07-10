package study.collections;

import org.junit.Test;
import programas.BaseTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueuesTest extends BaseTest {


    @Test
    public void queueTest() {
        Deque<Integer> deque = new ArrayDeque<>();
        BlockingQueue blockingQueue = new LinkedBlockingDeque();
        DelayQueue delayQueue = new DelayQueue();

    }
}
