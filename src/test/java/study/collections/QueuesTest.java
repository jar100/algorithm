package study.collections;

import org.junit.Test;
import programas.BaseTest;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.SortedSet;
import java.util.concurrent.*;

public class QueuesTest {
    

    @Test
    public void linkedBlockingQueue() {
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>();

    }

    @Test
    public void arrayBlockingQueue() {
        //원형 어레이 블로킹 큐

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
    }

    @Test
    public void priorityBlockingQueue() {
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
    }


    @Test
    public void delayQueue() {

        class Message implements Delayed {
            private int index;

            public Message(int index) {
                this.index = index;
            }

            @Override
            public long getDelay(TimeUnit unit) {
                return 1000;
            }

            @Override
            public int compareTo(Delayed o) {
                return 0;
            }
        }

        DelayQueue<Message> delayQueue = new DelayQueue<>();
    }


    @Test
    public void synchronousQueue() {


        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();

    }




    static ExecutorService e = Executors.newFixedThreadPool(2);
    static int N = 1000000;

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            int length = (i == 0) ? 1 : i * 5;
            System.out.print(length + "\t");
            System.out.println("LinkedBlockingTable");
            System.out.print(doTest(new LinkedBlockingQueue<Integer>(length), N) + "\t");

            System.out.println("ArrayBlockingQueue");
            System.out.print(doTest(new ArrayBlockingQueue<Integer>(length), N) + "\t");

            System.out.println("SynchronousQueue");
            System.out.print(doTest(new SynchronousQueue<Integer>(), N));
            System.out.println();
        }

        e.shutdown();
    }

    private static long doTest(final BlockingQueue<Integer> q, final int n) throws Exception {
        long t = System.nanoTime();

        e.submit(new Runnable() {
            public void run() {
                for (int i = 0; i < n; i++)
                    try { q.put(i); } catch (InterruptedException ex) {}
            }
        });

        Long r = e.submit(new Callable<Long>() {
            public Long call() {
                long sum = 0;
                for (int i = 0; i < n; i++)
                    try { sum += q.take(); } catch (InterruptedException ex) {}
                return sum;
            }
        }).get();
        t = System.nanoTime() - t;

        return (long)(1000000000.0 * N / t); // Throughput, items/sec
    }
}
