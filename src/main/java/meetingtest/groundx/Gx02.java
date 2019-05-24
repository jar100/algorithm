package meetingtest.groundx;

import java.util.Stack;

public class Gx02 {
    public String solution(String compressed) {
        Stack<Character> stack = new Stack<>();
        StringBuffer answer = new StringBuffer();


        for (int i = 0; i < compressed.length(); i++) {
            if (compressed.charAt(i) == 41) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.insert(0,compressed.charAt(i));
                while (stack.peek() != 40) {
                    stringBuffer.insert(0,stack.pop());
                }
                stringBuffer.insert(0,stack.pop());

                StringBuffer num = new StringBuffer();
                while (!stack.isEmpty() && stack.peek() > 47 && stack.peek() < 58) {
                    num.insert(0,stack.pop());
                }

                stack.addAll(makeString(Integer.parseInt(num.toString()),stringBuffer.toString()));

            } else {
                stack.add(compressed.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            answer.insert(0,stack.pop());
        }
        return answer.toString();
    }


    public Stack<Character> makeString(int num, String compressed) {
        Stack<Character> stack = new Stack<>();
        for (int j = 1; j <= num; j++) {
            for (int i = 1; i < compressed.length() - 1; i++) {
                stack.add(compressed.charAt(i));
            }
        }
        return stack;
    }
}
