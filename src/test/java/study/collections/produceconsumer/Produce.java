package study.collections.produceconsumer;

public class Produce extends Thread {

    private static int id = 0;

    Table table;

    public Produce(Table table) {
        this.table = table;

    }

    public void run() {
        while (true) {
            System.out.println("프로덕트런 : " + id);
            try {
                Thread.sleep(1000);
                String packet = "No : " + nextId();
                table.put(packet);  // 큐에 추가
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static synchronized int nextId() {

        return id++;

    }
}
