package study.collections.produceconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Table2 extends Table {
    private final Queue<String> buffer;

    public Table2(int count) {
        super(count);

        this.buffer = new LinkedList<>();

    }

    @Override
    public void put(String packet) throws InterruptedException {
        //Thread.sleep(1000);


        buffer.add(packet);

    }

    @Override
    public String take() throws InterruptedException {

        String packet = buffer.poll();

        return packet;

    }
}
