package study.collections.produceconsumer;

import org.junit.Test;
import programas.BaseTest;

public class ConsumerTest extends BaseTest {
    public static void main(String[] args) {
        Table table = new Table(100);

        new Produce(table).start();
        new Consumer(table).start();

    }
}
