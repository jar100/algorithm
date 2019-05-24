package meetingtest.groundx;

public class Triangle {
    public int solution(int width, int hegiht) {
        int answer = 0;
        // 최대 공약수가 있는가?
        int gcd = gcd(width,hegiht);
        if (isGCD(gcd)) {
            return width + hegiht - gcd;
        }
        // 없는가?
        return width + hegiht - 1;
    }


    public boolean isGCD(int gcd) {
        if (gcd == 1) {
            return false;
        }
        return true;
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int mod = num1 % num2;
            num1 = num2;
            num2 = mod;
        }
        return num1;
    }

}
