package programas.onemore.diskcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Disk> sortWithIndex = new PriorityQueue();
        PriorityQueue<Disk> priorityQueue2 = new PriorityQueue<>(this::compareToDelay);
        List<Disk> answers = new ArrayList<>();
        for (int[] job : jobs) {
            sortWithIndex.add(new Disk(job[0], job[1]));
        }


        int time = 0;

        while (!sortWithIndex.isEmpty()) {
            while (!sortWithIndex.isEmpty() && sortWithIndex.peek().index <= time) {
                priorityQueue2.add(sortWithIndex.poll());
            }

            if (!priorityQueue2.isEmpty()) {
                Disk andDisk = priorityQueue2.poll();
                answers.add(andDisk);
                time += andDisk.delayTime;

                answer += time - andDisk.index;
                for (Disk disk : priorityQueue2) {
                    sortWithIndex.add(disk);
                }
                priorityQueue2.clear();
            } else {
                time ++;
            }

        }
        System.out.println("디스크 : " + answers);
        int b = (int) Math.floor((answer / jobs.length));
        // 디스크가

        return b;
    }

    public int compareToDelay(Disk o1, Disk o2) {
        if (o1.delayTime > o2.delayTime) {
            return 1;
        } else if (o1.delayTime < o2.delayTime) {
            return -1;
        } else {
            return 0;
        }

    }

    public int compareToOther(Disk o1, Disk o2) {
        if (o1.delayTime < o2.delayTime) return -1;
        else if (o1.delayTime == o2.delayTime) {
            if (o1.index < o1.index) return -1;
            else return 1;
        } else return 1;
    }


    public int solution2(int[][] jobs) {
        List<Disk> answers = new ArrayList<>();

        int answer = 0;
        PriorityQueue<Disk> sortWithIndex = new PriorityQueue();
        PriorityQueue<Disk> priorityQueue2 = new PriorityQueue<>(this::compareToDelay);
        for (int[] job : jobs) {
            sortWithIndex.add(new Disk(job[0], job[1]));
        }


        int time = 0;

        while (!sortWithIndex.isEmpty()) {
            for (Disk withIndex : sortWithIndex) {
                if (withIndex.index <= time) {
                    priorityQueue2.add(withIndex);

                }

            }
            if (!priorityQueue2.isEmpty()) {
                Disk andDisk = priorityQueue2.poll();
                answers.add(andDisk);
                time += andDisk.delayTime;

                answer += time - andDisk.index;
                sortWithIndex.remove(andDisk);
                priorityQueue2.clear();
            }


        }
        System.out.println("디스크 : " + answers);
        int b = (int) Math.floor((answer / jobs.length));
        // 디스크가

        return b;
    }


    public int solution3(int[][] jobs) {
        int answer = 0;
        int time = 0;
        List<Disk> answers = new ArrayList<>();
        PriorityQueue<Disk> priorityQueue2 = new PriorityQueue<>(this::compareToOther);

        for (int[] job : jobs) {
            priorityQueue2.add(new Disk(job[0], job[1]));
        }

        for (int i = 0; i < jobs.length; i++) {
            answers.add(priorityQueue2.poll());
        }
        System.out.println("디스크 : " + answers);
        while (!answers.isEmpty()) {
            for (int i = 0; i < answers.size(); i++) {
                if (answers.get(i).index <= time) {
                    Disk andDisk = answers.get(i);
                    time += andDisk.delayTime;

                    answer += time - andDisk.index;
                    answers.remove(andDisk);
                    break;
                }
                if (i == answers.size()-1) time++;
            }
        }

        int b = (int) Math.floor((answer / jobs.length));
        return b;
    }



    class Disk implements Comparable<Disk> {
        private int index;
        private int delayTime;

        public Disk(int index, int delayTime) {
            this.index = index;
            this.delayTime = delayTime;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Disk disk = (Disk) o;
            return index == disk.index &&
                    delayTime == disk.delayTime;
        }

        @Override
        public int hashCode() {
            return Objects.hash(index, delayTime);
        }

        @Override
        public int compareTo(Disk o) {
            if (this.index > o.index) {
                return 1;
            } else if (this.index < o.index) {
                return -1;
            } else {
                if (this.delayTime > o.delayTime) {
                    return 1;
                } else if (this.delayTime < o.delayTime){
                    return -1;
                }
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Disk{" +
                    "index=" + index +
                    ", delayTime=" + delayTime +
                    '}';
        }
    }


}
