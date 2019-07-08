package study.collections.produceconsumer;

public class Consumer extends Thread {
    private final Table table;

    public Consumer(Table table) {
        this.table = table;
    }

    public void run() {
        while (true) {
            System.out.println("커스터머런");
            try {
                Thread.sleep(10000);
                String packet = null;   // 큐에서 가져옴
                packet = table.take();
                System.out.println("consumer : " + packet);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

}

