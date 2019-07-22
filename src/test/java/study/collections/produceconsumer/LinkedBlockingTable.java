package study.collections.produceconsumer;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingTable extends Table{

    private final LinkedBlockingQueue<String> buffer;

    public LinkedBlockingTable(int count) {
        super(10);
        this.buffer = new LinkedBlockingQueue<>();

    }

    public void put(String packet) throws InterruptedException {
        //Thread.sleep(1000);
        buffer.put(packet);

    }

    public String take() throws InterruptedException {
        String packet = buffer.take();
        return packet;

    }
}
