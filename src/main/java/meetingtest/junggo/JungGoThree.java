package meetingtest.junggo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JungGoThree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String splitBlank = " ";
        String answer = "";
        String[] input = br.readLine().split(splitBlank);

        int[] points = new int[2];

        points[0] = Integer.parseInt(input[0]);
        points[1] = Integer.parseInt(input[1]);

        if (points[0] > 0 && points[1] > 0 ) {
            System.out.print(1);
        }

        if (points[0] < 0 && points[1] > 0) {
            System.out.print(2);
        }

        if (points[0] < 0 && points[1] < 0) {
            System.out.print(3);
        }

        if (points[0] > 0 && points[1] < 0) {
            System.out.print(4);
        }
    }
}
