package programas.clear.doublepriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> priorityQueueWithMax = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> priorityQueueWithMin = new PriorityQueue<>();

        for (String operation : operations) {
            String[] splitOther = operation.split(" ");

            if (splitOther[0].equals("I")) {
                priorityQueueWithMax.add(Integer.parseInt(splitOther[1]));
                priorityQueueWithMin.add(Integer.parseInt(splitOther[1]));
            }

            if (splitOther[0].equals("D")) {
                if (!priorityQueueWithMax.isEmpty()) {
                    if (splitOther[1].equals("1")) {
                        int max = priorityQueueWithMax.poll();
                        priorityQueueWithMax.remove(max);

                    } else {
                        int min = priorityQueueWithMin.poll();
                        priorityQueueWithMax.remove(min);
                    }
                }
            }

        }
        if (!priorityQueueWithMax.isEmpty()) {
            answer[0] = priorityQueueWithMax.peek();
            answer[1] = priorityQueueWithMin.peek();

        }
        return answer;
    }
}
