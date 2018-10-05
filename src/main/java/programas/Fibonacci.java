package programas;

public class Fibonacci {
    public static int solution(int n) {
        int answer = fibo(n) % 1234567;
        return answer;
    }

    public static int fibo(int n) {
        int[] fiboNum = new int[n+1];
        fiboNum[0] = 0;
        fiboNum[1] = 1;
        fiboNum[2] = 1;
        for (int i = 3; i <= n; i++) {
            fiboNum[i] = fiboNum[i-1] + fiboNum[i-2];
        }
        return fiboNum[n];
    }

}
