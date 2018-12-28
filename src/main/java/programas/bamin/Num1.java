package programas.bamin;

public class Num1 {
    public static int solution(String s) {
        int answer = 0;
        int input = Integer.parseInt(s,2);
        if (input % 2 != 0) {
            input --;
        }
        while (input != 0) {
            answer ++;
            if (input % 2 != 0) {
                input --;
            } else {
                input = input / 2;
            }
        }
        return answer;
    }
}
