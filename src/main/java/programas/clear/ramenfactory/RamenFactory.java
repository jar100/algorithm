package programas.clear.ramenfactory;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RamenFactory {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int index = 0;
        for (int i = 0; i < k; i++) {
            if (index < dates.length) {
                if (i == dates[index]) {
                    priorityQueue.offer(supplies[index]);
                    index ++;
                }
            }

            if (i == stock) {
                int a = priorityQueue.remove();
                System.out.println(priorityQueue);
                stock += a;
                answer ++;
                System.out.println(a);
            }

        }

        return answer;
    }

}
