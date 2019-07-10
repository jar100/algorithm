package study.collections.produceconsumer;

import org.junit.Test;

public class ConsumerTest {
    public static Table table = new Table(100);

    public static Thread a = new Produce(table);
    public static Thread b = new Consumer(table);

    @Test
    public void name() {
        a.start();
        b.start();
    }

    public static void main(String[] args) {
        Table table = new Table(100);

        new Produce(table).start();
        new Consumer(table).start();

    }
}
