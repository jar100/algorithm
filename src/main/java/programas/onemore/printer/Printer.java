package programas.onemore.printer;

import java.util.*;

public class Printer {
    public static int solution(int[] priorities, int location) {
        Queue<Prints> printlist = new LinkedList<>();
        int answer = 1;
        int index = 0;
        for (int priority : priorities) {
            Prints prints = new Prints(index, priority);
            prints.isTerget(location);
            printlist.offer(prints);
            index++;
        }
        while (!printlist.isEmpty()) {
            Prints prints = printlist.poll();
            if (prints.isBigger(printlist)) {
                if (prints.target) {
                    return answer;
                }
                answer ++;
            } else {
                printlist.offer(prints);
            }
        }
        return answer;
    }

    static class Prints {
        int index;
        int ranking;
        boolean target = false;

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

        public void isTerget(int location) {
            if (location == index) {
                target = true;
            }
        }
    }

    public static int solutionOthers(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for (int i : priorities) {
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;


        while (!que.isEmpty()) {
            Integer i = que.poll();
            if (i == priorities[size - answer]) {
                answer++;
                l--;
                if (l < 0)
                    break;
            } else {
                que.add(i);
                l--;
                if (l < 0)
                    l = que.size() - 1;
            }
        }

        return answer;
    }
}




