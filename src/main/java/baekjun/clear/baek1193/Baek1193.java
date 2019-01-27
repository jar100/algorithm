package baekjun.clear.baek1193;

import java.util.ArrayList;
import java.util.List;

public class Baek1193 {
    public static String solution(int n) {
        int intCount = 1;
        int answerA = 1;
        int answerB = 1;
        int count = 0;
        List<Integer> intcountList = new ArrayList<>();

        while (intCount <= n) {
            count ++;
           //a intcountList.add()
            intCount = intCount + count;
        }

        if (intCount == n) {
            return answerA + "/" + intCount;
        }



        return answerA + "/" + answerB;
    }
}
