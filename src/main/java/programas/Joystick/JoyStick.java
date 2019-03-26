package programas.Joystick;

public class JoyStick {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int nowIndex = 0;
        int distance = 0;
        int tempIndex = Integer.MAX_VALUE;
        int tempIndexDistance = Integer.MAX_VALUE;
        int count = 0;
        int[] answerLength = new int[length];
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                if (name.charAt(i) - 65 > 13) {
                    answerLength[i] = 91 - name.charAt(i);

                } else {
                    answerLength[i] = name.charAt(i) - 65;
                }
                count ++;
            }
        }

        while (count > 0) {
            for (int i = 0; i < answerLength.length; i++) {
                if (answerLength[i] != 0) {
                    int indexDistance = Math.abs(nowIndex - i);
                    if (indexDistance > answerLength.length / 2) {
                        indexDistance = length - i + nowIndex;
                    }

                    if (tempIndexDistance > indexDistance){
                        distance = indexDistance + answerLength[i];
                        tempIndex = i;
                        tempIndexDistance = indexDistance;
                    }
                }
            }
            answer += distance;
            answerLength[tempIndex] = 0;
            nowIndex = tempIndex;
            tempIndex = Integer.MAX_VALUE;
            tempIndexDistance = Integer.MAX_VALUE;
            count--;
        }


        return answer;
    }

}
