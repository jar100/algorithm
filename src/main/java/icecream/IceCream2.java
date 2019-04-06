package icecream;

import java.util.ArrayList;
import java.util.List;

public class IceCream2 {
    StringBuffer sb = new StringBuffer();
    public List<String> solution(String[] docs) {
        List<String> answer = new ArrayList<>();
        int startIndex;
        for (String s : answer) {
            if (s.contains("note")) {
                startIndex = s.indexOf("note");
                if (s.charAt(startIndex -1) == ' ') {

                }
            }
        }
        return answer;
    }
}
