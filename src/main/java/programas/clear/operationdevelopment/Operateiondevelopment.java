package programas.clear.operationdevelopment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Operateiondevelopment {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Work> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            Work work = new Work(progresses[i],speeds[i]);
            queue.offer(work);
        }

        // 스피드만큼한번 증가시킴 => date 1++
        while (!queue.isEmpty()) {

            for (Work work : queue) {
                work.increase();
            }
            int count = 0;
            while (!queue.isEmpty() && queue.peek().getProgress() >= 100) {
                queue.poll();
                count++;
            }
            if (count != 0) {
                list.add(count);
            }
        }
        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }

    static class Work {
        int progress = 0;
        int speed = 0;

        public Work(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public int getProgress() {
            return progress;
        }

        public void increase() {
            progress += speed;
        }
    }
}
