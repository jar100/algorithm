package programas;
/*
 *   두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 *  예를 들어 2와 7의 최소공배수는 14가 됩니다.
 *  정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 *  n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 *
 * */

public class FindLCM {
    public static int solution(int[] input) {
        int result = 1;
        for (int i = 0; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }

    // 최대 공약수
    static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int mod = num1 % num2;
            num1 = num2;
            num2 = mod;
        }
        return num1;
    }

    // 최소 공배수
    static int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }

}
