package programas;

import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(fibo(n));
        System.out.println(fibo2(n));

        System.out.println(solution2(n));
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
            fiboNum[i] = (fiboNum[i-1] + fiboNum[i-2]) % 1234567;
        }
        int answer =(int) (long)(fiboNum[n] % 1234567);
        return answer;
    }

    public static int solution2(int n) {
        if (n < 2)
            return 1;

        BigInteger[] fiboMemo = new BigInteger[n];
        fiboMemo[0] = BigInteger.valueOf(0);
        fiboMemo[1] = BigInteger.valueOf(1);

        for (int i = 2; i < n; i++)
            fiboMemo[i] = fiboMemo[i - 1].add(fiboMemo[i - 2]);

        return fiboMemo[n - 1].add(fiboMemo[n - 2]).mod(BigInteger.valueOf(1234567)).intValue();
    }
}
