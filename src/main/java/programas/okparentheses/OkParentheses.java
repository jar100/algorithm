package programas.okparentheses;

import java.util.Stack;

public class OkParentheses {
    public static boolean solution(String s) {
        boolean answer = false;
        int stack = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
            stack ++;
            } else if (s.charAt(i) == ')') {
                if (stack != 0) {
                    stack --;
                }
                else {
                    return false;
                }
            }
        }

        if (stack == 0) {
            answer = true;
        }
        return answer;
    }
}
