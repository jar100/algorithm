package hackerrank.newyearchaos;

public class NewYearChaos {
    static void minimumBribes(int[] q) {
        /*
        *
        * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
        * */
        int answer = 0;
        int[] befor = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            befor[i] = i + 1;
        }
        for (int i = 0; i < q.length; i++) {
            int num = q[i] - (i + 1);
            if (num > 2 && num > 0) {
                System.out.println("Too chaotic");
                return;
            } else if (num > 0){
                if (num == 2) {
                    int temp = befor[i + 2];
                    befor[i + 2] = befor[i + 1];
                    befor[i + 1] = befor[i];
                    befor[i] = temp;
                }

                if (num == 1) {
                    int temp = befor[i + 1];
                    befor[i + 1] = befor[i];
                    befor[i] = temp;
                }

                answer += num;
            } else if(q[i] != befor[i]) {
                int temp = befor[i + 1];
                befor[i + 1] = befor[i];
                befor[i] = temp;
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
