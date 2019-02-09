package programas.clear.maximumnum;

import java.util.ArrayList;
import java.util.List;

public class MaximumNum {
    public String solution(int[] ints) {
        String answer = "";
        List<String> stringList = new ArrayList<>();


        for (int anInt : ints) {
            stringList.add(String.valueOf(anInt));
        }
        stringList.sort(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        for (String s : stringList) {
            answer += s;
        }

        return answer.charAt(0) == '0'? "0": answer;
    }
}
