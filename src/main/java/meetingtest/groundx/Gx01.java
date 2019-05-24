package meetingtest.groundx;

public class Gx01 {
    public int solution(int[] v) {
        int answer = 0;
        int k = 1;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == 1) {
                answer += (i + 1) * k;
                k++;
            } else {
                k = 1;
            }
        }

        return answer;
    }
}
