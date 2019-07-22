package study.collections.produceconsumer;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ConsumerTest {

    @Test
    public void name() throws Exception{

        Table table = new Table(100);

        new Produce(table).start();
        new Consumer(table).start();

        // junit 은 라인을 다 실행하고 thread 를 종료함으로 junit 스레드를 대기시키면 동작을 확인할 수 있다.
        // 단점 슬립하는 정확한 시간을 보장하지 않는다.
        // awaitility 라이브러리 사용하면 더 확장성있는 테스트를 할 수 있음
        Thread.sleep(30000);
    }

    @Test
    public void linkedBlockingTable() throws Exception{

        LinkedBlockingTable table = new LinkedBlockingTable(100);

        new Produce(table).start();
        new Consumer(table).start();

        // junit 은 라인을 다 실행하고 thread 를 종료함으로 junit 스레드를 대기시키면 동작을 확인할 수 있다.
        // 단점 슬립하는 정확한 시간을 보장하지 않는다.
        // awaitility 라이브러리 사용하면 더 확장성있는 테스트를 할 수 있음
        Thread.sleep(30000);
    }


    public static void main(String[] args) {
        Table table = new Table(100);

        new Produce(table).start();
        new Consumer(table).start();

    }
}
