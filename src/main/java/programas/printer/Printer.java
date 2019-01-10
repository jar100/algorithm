package programas.printer;

import java.util.*;

public class Printer {
    public static int solution(int[] priorities, int location) {
        Queue<Prints> list = new LinkedList<>();
        Queue<Prints> printlist = new LinkedList<>();
        int answer = 0;
        int index = 0;

        for (int priority : priorities) {
            list.add(new Prints(index, priority));
            index++;
        }
        while (!printlist.isEmpty()) {
            if (printlist.peek().isBigger(printlist)) {

            }
        }

        Stack<Prints> standbyRanking = new Stack<>();

        // 나보다 큰놈이 있나 확인 있으면 대기순위에 저장
        for (Prints prints : printlist) {

        }

        return answer;
    }

    static class Prints {
        int index;
        int ranking;

        public Prints(int index, int ranking) {
            this.index = index;
            this.ranking = ranking;
        }

        public boolean isBigger(Queue<Prints> others) {
            for (Prints other : others) {
                if (this.ranking < other.ranking) {
                    return false;
                }
            }
            return true;
        }
    }
}
