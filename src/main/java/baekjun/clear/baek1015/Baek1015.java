package baekjun.clear.baek1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine().split(" ")[0]);

        String[] temp = bf.readLine().split(" ");

        int[] b = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();

        int[] answer = solution(a, b);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]);
            if (i != answer.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);

    }

    public static int[] solution(int n, int[] a) {
        int[] one = findAnswer(n, a);
        int[] answer = findAnswer(n, one);
        return answer;
    }


    public static int[] findAnswer(int n, int[] a) {
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            c[i] = getIndexOf(b[i], a);
        }

        return c;
    }

    public static int getIndexOf(int toSearch, int[] tab) {
        for (int i = 0; i < tab.length; i++)
            if (tab[i] == toSearch) {
                tab[i] = -1;
                return i;
            }
        return -1;
    }
}
