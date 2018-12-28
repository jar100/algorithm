package programas.bamin;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Num3 {
    public static int solution(int[] A, int[] B, int M, int X, int Y) {
        int elevatorMax = M;
        int elevatorMaxPerson = X;
        int elevatorMaxWight = Y;
        int answer = 0;
        List<int[]> personQueue = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int[] personInfo = new int[2];
            personInfo[0] = A[i];
            personInfo[1] = B[i];
            personQueue.add(personInfo);
        }

        for (int i = 0; i < personQueue.size(); i++) {
            personQueue.get(i);

        }



        return answer;
    }
}
