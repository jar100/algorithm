package study.collections.produceconsumer;

public class Produce extends Thread {

    private static int id = 0;

    Table table;

    public Produce(Table table) {
        this.table = table;

    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                String packet = "No : " + nextId();
                table.put(packet);  // 큐에 추가
                System.out.println(packet + " 프로듀스 런");

            } catch (InterruptedException e) {
                throw new IllegalThreadStateException();
            }
        }
    }

    private static synchronized int nextId() {

        return id++;

    }
}
