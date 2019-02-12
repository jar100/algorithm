package programas.clear.notfinishrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NotFinishRun {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> runUsers = new ArrayList<>(Arrays.asList(participant));
        List<String> finishUsers = new ArrayList<>(Arrays.asList(completion));
        runUsers.sort(String::compareTo);
        finishUsers.sort(String::compareTo);
        for (int i = 0; i < finishUsers.size(); i++) {
            if (!finishUsers.get(i).equals(runUsers.get(i))) {
                return runUsers.get(i);
            }
        }
        return runUsers.get(runUsers.size() - 1);
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant) {
            if (!hashMap.containsKey(s)) {
                hashMap.put(s, 0);
            }
            hashMap.put(s, hashMap.get(s) + 1);
        }

        for (String s : completion) {
            hashMap.put(s, hashMap.get(s) - 1);
        }

        for (String s : hashMap.keySet()) {
            if (hashMap.get(s) != 0) {
                return s;
            }
        }
        return answer;
    }
}
