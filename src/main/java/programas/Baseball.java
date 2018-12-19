package programas;

import java.util.ArrayList;

public class Baseball {

    private int[] answer;
    private int ball;
    private int strike;
    private boolean out = false;

    private Baseball(int answer) {
        this.answer = divideNum(answer);
    }

    public static Baseball ofNewGame(int answer) {
        return new Baseball(answer);
    }

    public int solution(int[][] baseball) {
        int answer = 0;
        return answer;
    }


    public void check(int yourNum) {
        // 쪼개고 비교하고 리턴
        // 메소드끼리 의존성이 적으면 리팩토링이 더 쉽다.
        int[] divdeNum = divideNum(yourNum);
        strike = checkStrike(divdeNum);
        ball = checkBall(divdeNum);
        out = checkOut(divdeNum);
    }

    private boolean checkOut(int[] divdeNum) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : answer) {
            list.add(i);
        }
        int count = 0;
        for (int i = 0; i < divdeNum.length; i++) {
            if (list.contains(divdeNum[i])) {
                return false;
            }
        }
        return true;
    }

    private int checkBall(int[] divdeNum) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : answer) {
            list.add(i);
        }
        int count = 0;
        for (int i = 0; i < divdeNum.length; i++) {
            if (list.contains(divdeNum[i]) && (list.get(i) != divdeNum[i])) {
                count ++;
            }
        }
        return count;
    }

    private int checkStrike(int[] num) {
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == num[i]) {
                count ++;
            }
        }
        return count;
    }

    private int[] divideNum(int yourNum) {
        int number = yourNum;
        String temp = Integer.toString(number);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i) - '0';
        }
        return digits;
    }

    public int resultBall() {
        return ball;
    }

    public int resultStrike() {
        return strike;
    }

    public boolean isOut() {
        return out;
    }

    public void reset() {
        strike = 0;
        ball = 0;
        out = false;
    }
}
