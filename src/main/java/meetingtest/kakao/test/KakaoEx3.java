package meetingtest.kakao.test;

import java.util.*;

public class KakaoEx3 {
    public int[] solution(int N, int[] coffee_times) {
        int[] answer;

        List<Integer> answerlist = new ArrayList<>();
        List<Coffee> coffe_list = new ArrayList<>();

        for (int i = 0; i < coffee_times.length; i++) {
            coffe_list.add(new Coffee(i + 1, coffee_times[i]));
        }


        // 우선순위 큐를 이용
        // peck 으로 다를때 까지 뽑고 다르면 뽑은수만큼 타임감소

        while (answerlist.size() != coffee_times.length) {
            for (int i = 0; i < N; i++) {
                coffe_list.get(i).increasTime();
                if (coffe_list.get(i).isFinish()) {
                    answerlist.add(coffe_list.get(i).index);
                    coffe_list.remove(i);
                    coffe_list.add(new Coffee(99, 99));
                }
            }
        }
        answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }



    class Coffee implements Comparable<Coffee> {
        private int index;
        private int time = 0;
        private int finishTime;


        public Coffee(int index, int finishTime) {
            this.index = index;
            this.finishTime = finishTime;
        }

        public void increasTime() {
            time++;
        }

        public void increasTime(int time) {
            this.time += time;
        }


        public boolean isFinish() {
            return time == finishTime;
        }

        public void reduceTime(int time) {
            finishTime -= time;
        }


        @Override
        public int compareTo(Coffee o) {
            if (this.finishTime - this.time > o.finishTime - o.time) {
                return 1;
            } else if (this.finishTime - this.time < o.finishTime - o.time) {
                return -1;
            }
            return 0;
        }
    }
}
