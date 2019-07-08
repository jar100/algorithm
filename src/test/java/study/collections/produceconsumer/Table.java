package study.collections.produceconsumer;

public class Table {
    private final String[] buffer;

    private int tail;

    private int head;

    private int count;

    public Table(int count) {

        this.buffer = new String[count];

        this.head = 0;

        this.tail = 0;

        this.count = 0;

    }

    public synchronized void put(String packet) {

        while (count >= buffer.length) {   // 버퍼가 가측 차면 대기!
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        buffer[tail] = packet;   // 후입하라!

        tail = (tail + 1) % buffer.length;  // Circular 큐라서 tail 의 위치가 바뀜!

        count++;

        notifyAll();  // 버퍼에 먼가가 들어 갔으니 take 해도 된다고 이벤트 날림!!

    }

    public synchronized String take() {

        while (count <= 0) {   // 버퍼에 아무것도 없으면 대기!

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        String packet = buffer[head];  // 선출하라!

        head = (head + 1) % buffer.length;  // Circular 큐라서 header 의 위치가 바뀜!

        count--;

        notifyAll();  // 버퍼에서 하나를 가져갔으니 put 해도 된다고 이벤트 날림!!!

        return packet;

    }
}
