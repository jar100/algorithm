package study.collections.produceconsumer;

public class Consumer extends Thread {
    private final Table table;

    public Consumer(Table table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(4000);

                String packet = table.take();
                System.out.println("consumer : " + packet);
            } catch (InterruptedException e) {
                throw new IllegalThreadStateException();
            }


        }

    }

}

