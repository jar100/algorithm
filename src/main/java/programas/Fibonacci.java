package programas;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9999;
        System.out.println(fibo(n));
        System.out.println(fibo2(n));
    }

    public static int solution(int n) {
        int answer = fibo(n);
        return answer;
    }

    public static int fibo(int n) {
        int[] fiboNum = new int[n+1];
        fiboNum[0] = 0;
        fiboNum[1] = 1;
        fiboNum[2] = 1;
        for (int i = 3; i <= n; i++) {
            fiboNum[i] = fiboNum[i-1] + fiboNum[i-2] % 1234567;
        }
        return fiboNum[n];
    }

    public static long fibo2(int n) {
        long[] fiboNum = new long[n+1];
        fiboNum[0] = 0;
        fiboNum[1] = 1;
        fiboNum[2] = 1;
        for (int i = 3; i <= n; i++) {
            fiboNum[i] = fiboNum[i-1] + fiboNum[i-2];
        }
        int answer =(int) (long)(fiboNum[n] % 1234567);
        return answer;
    }
}
