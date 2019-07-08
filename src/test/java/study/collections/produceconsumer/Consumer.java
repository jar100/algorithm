package study.collections.produceconsumer;

public class Consumer extends Thread {
    private final Table table;

    public Consumer(Table table) {

        this.table = table;

    }

    public void run() {

        while (true) {

            String packet = table.take();   // 큐에서 가져옴

            System.out.println("consumer : " + packet);

        }

    }

}

