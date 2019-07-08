package study.collections.produceconsumer;

import org.junit.Test;
import programas.BaseTest;

public class ConsumerTest extends BaseTest {
    @Test
    public void name() {
        Table table = new Table(100);

        new Produce(table).start();

        new Consumer(table).start();


    }
}
