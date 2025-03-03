package codility.naver;

public class solution {
    public int solution01(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        for (int i : A) {
            answer ^= i;
        }


        return answer;

    }
}
