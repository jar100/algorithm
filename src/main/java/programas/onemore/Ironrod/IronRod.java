package programas.onemore.Ironrod;

import java.util.Stack;

public class IronRod {

    public int solution(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        arrangement = arrangement.replace("()","a");
        for (int i = 0; i <arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                int aCount = 1;
                for (int j = i; j < arrangement.length(); j++) {
                    if (arrangement.charAt(j) == '(') {
                        stack.push(arrangement.charAt(j));
                    }
                    if (arrangement.charAt(j) == 'a') {
                        aCount ++;
                    }

                    if (arrangement.charAt(j) == ')') {
                        stack.pop();
                        if (stack.empty()) {
                            answer += aCount;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }


    public int solution2(String arrangement) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                st.push(i);
            } else if (arrangement.charAt(i) == ')') {
                if (st.peek() + 1 == i) {
                    st.pop();
                    answer += st.size();
                } else {
                    st.pop();
                    answer += 1;
                }
            }
        }
        return answer;
    }


}
