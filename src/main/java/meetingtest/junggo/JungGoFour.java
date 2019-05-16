package meetingtest.junggo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JungGoFour {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        String input = br.readLine();
        int maxIndex = input.length() - 1;


        for (int i = 0; i <= input.length() / 2 ; i++) {
            if (i <= maxIndex) {
                answer += input.charAt(i);
                if (i != maxIndex) {
                    answer += input.charAt(maxIndex);
                }
                maxIndex --;
            }
        }

        System.out.println(answer);

    }
}
