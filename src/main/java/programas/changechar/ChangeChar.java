package programas.changechar;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ChangeChar {
    /*
     * 최적의 길을 찾는게 아닌 빠른길을 찾는것이니
     *10
     *
     *
     * */

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        // 워드스랑 비교

        boolean[] isVisited = new boolean[words.length];
        answer = dfs(begin, target, words, 0, isVisited, " ");
        System.out.println(answer);
        
        if (answer == 99) {
            return 0;
        }

        return answer;
    }

    // length 값까지 근대 넘으면 99;
    private int dfs(String begin, String target, String[] words, int count, boolean[] isVisited, String history) {
        if (begin.equals(target)) {
            return count;
        }
        if (count > words.length) {
            return 99;
        }
        int answer = 99;

        boolean[] newIsVisited = new boolean[isVisited.length];
        for (int i = 0; i < isVisited.length; i++) {
            newIsVisited[i] = isVisited[i];
        }

        for (int i = 0; i < words.length; i++) {
            if (onlyOneThingIsWrong(begin, words[i])) {
                if (!isVisited[i]) {
                    newIsVisited[i] =true;
                    int newAnswer = dfs(words[i], target, words, count + 1, newIsVisited, history + words[i]);
                    answer = newAnswer < answer ? newAnswer : answer;
                }


            }

        }
        return answer;
    }

    private boolean onlyOneThingIsWrong(String begin, String word) {
        int count = 0;
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != word.charAt(i)) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }
        return true;
    }



}
