package codility.checkunpair;

public class CheckUnpair {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        for (int i : A) {
            answer ^= i;
        }


        return answer;

    }
}
