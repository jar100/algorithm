package programas.test;

import java.util.ArrayList;
import java.util.List;

public class kakaoEx3 {
    public int[] solution(int N, int[] coffee_times) {
        int[] answer;

        List<Integer> answerlist = new ArrayList<>();
        List<Coffee> coffe_list = new ArrayList<>();

        for (int i = 0; i < coffee_times.length; i++) {
            coffe_list.add(new Coffee(i+1,coffee_times[i]));
        }

        while (answerlist.size() != coffee_times.length) {
            for (int i = 0; i < N; i++) {
                coffe_list.get(i).increasTime();
                if (coffe_list.get(i).isFinish()) {
                    answerlist.add(coffe_list.get(i).index);
                    coffe_list.remove(i);
                    coffe_list.add(new Coffee(99,99));
                }
            }
        }
        answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    class Coffee {
        private int index;
        private int time = 0;
        private int finishTime;


        public Coffee(int index, int finishTime) {
            this.index = index;
            this.finishTime = finishTime;
        }

        public void increasTime() {
            time ++;
        }

        public boolean isFinish() {
            return time == finishTime;
        }
    }
}
