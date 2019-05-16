package meetingtest.junggo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JungGoTwo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String splitBlank = " ";
        String answer = "";
        String[] length = br.readLine().split(splitBlank);
        int aLength = Integer.parseInt(length[0]);
        int bLength = Integer.parseInt(length[1]);

        String[] aArray = br.readLine().split(splitBlank);
        int[] aArrayForInt = new int[aLength];
        for (int i = 0; i < aArray.length; i ++) {
            aArrayForInt[i] = Integer.parseInt(aArray[i]);
        }

        String[] bArray = br.readLine().split(splitBlank);
        int[] bArrayForInt = new int[bLength];
        for (int i = 0; i < bArray.length; i++) {
            bArrayForInt[i] = Integer.parseInt(bArray[i]);
        }

        int[] abArray = new int[aLength + bLength + 1];
        System.arraycopy(aArray, 0, aArrayForInt, 0, aLength);
        System.arraycopy(bArray, 0, bArrayForInt, aLength, bLength);
        Arrays.sort(abArray);

        for (int i = 0; i < abArray.length; i++) {
            answer += abArray[i];

            if (i != abArray.length -1 ) {
                answer += " ";
            }
        }

        System.out.println(answer);
    }

    public int solution() {
        return 1;
    }
}
