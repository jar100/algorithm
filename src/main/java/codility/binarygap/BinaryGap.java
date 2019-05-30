package codility.binarygap;

public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        int answer = 0;
        String binary = Integer.toBinaryString(N);
        int target = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                answer = i - target - 1 > answer ? i - target - 1 : answer ;
                target = i;
            }
        }
        return answer;
    }
}
