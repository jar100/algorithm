package programas.clear.indexknum;

import java.util.Arrays;

public class IndexOfKNum {
    /*
     * 1. 원하는 길이로 어레이를 짜른다.
     * 2. 짜른것에서의 k인덱스를 찾는다.
     * 3. 엔서에 저장
     *
     *
     * */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int commandIndex = 0;
        for (int[] command : commands) {
            int spliceIndex = 0;
            int[] spliceArray = new int[command[1] - command[0] + 1];
            for (int i = command[0] - 1; i < command[1]; i++) {
                spliceArray[spliceIndex] = array[i];
                spliceIndex++;
            }
            Arrays.sort(spliceArray);
            answer[commandIndex] = spliceArray[command[2] - 1];
            commandIndex++;
        }

        return answer;
    }
}
