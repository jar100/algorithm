package programas.clear.bamin;

import java.util.*;

public class Num3 {
    // 너무나도 객체로 뽑고 싶다. 내일은 객체로 뽑아 동작시켜봐야겠다.
    public static int solution(int[] A, int[] B, int M, int X, int Y) {
        int elevatorMaxfloor = M;
        int elevatorMaxPerson = X;
        int elevatorMaxWight = Y;
        int answer = 0;
        int elevatorWight = 0;
        int elevatorInPerson = 0;
        Integer[] targetPersonInfo;

        Queue<Integer[]> personQueue = new LinkedList<>();
        Set<Integer> elevatorTargetFloor = new HashSet<>();
        // 사람을 큐에 넣는다.
        for (int i = 0; i < A.length; i++) {
            Integer[] personInfo = new Integer[2];
            personInfo[0] = A[i];
            personInfo[1] = B[i];
            personQueue.offer(personInfo);
        }

        while (!personQueue.isEmpty()) {
            //엘베에 사람을 넣는다. 조건: 엘베의 무게 까지 넣는다.
            for (int i = 0; i < personQueue.size(); i++) {
                if (elevatorMaxWight > (elevatorWight + personQueue.peek()[0])
                        && elevatorMaxPerson > elevatorInPerson) {
                    targetPersonInfo = personQueue.poll();
                    elevatorWight += targetPersonInfo[0];
                    elevatorTargetFloor.add(targetPersonInfo[1]);
                    elevatorInPerson++;
                }
            }
            //목표 층의 크기만큼 움직일태고 나머지 엘베의 정보를 초기화해준다.
            answer += elevatorTargetFloor.size();
            elevatorWight = 0;
            elevatorInPerson = 0;
            elevatorTargetFloor.clear();
            // 대기한 사람이 남아있으면 1층으로 태우러 돌아간다.
            if (!personQueue.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
