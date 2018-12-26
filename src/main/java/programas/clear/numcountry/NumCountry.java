package programas.clear.numcountry;

public class NumCountry {
    public static String solution(int input) {
        String answer = "";
        int rmd;
        while (input > 0) {
            rmd = input % 3;
            input = input / 3;
            if (rmd == 0) {
                input -= 1;
                rmd = 4;
            }
            answer = rmd + answer;
        }
        return answer;
    }
}
