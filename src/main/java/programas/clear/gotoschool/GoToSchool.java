package programas.clear.gotoschool;

//프로그래머스 등굣길

    import java.util.Arrays;

    public class GoToSchool {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;

        int[][] findAnswer = new int[n + 1][m + 1];
        int puddlesIndex = 0;
        sort(puddles);
        if (puddles[0].length == 0) {
            puddlesIndex = puddles.length + 1;
        }

        findAnswer[1][1] = 1;

        for (int i = 1; i < findAnswer.length; i++) {
            int[] ints = findAnswer[i];
            for (int j = 1; j < ints.length; j++) {
                //todo 웅덩이조건
                if (puddlesIndex < puddles.length && (puddles[puddlesIndex][1] == i && puddles[puddlesIndex][0] == j)) {
                    puddlesIndex++;
                } else {
                    if (i == 1) {
                        ints[j] += ints[j - 1];
                    } else {
                        ints[j] = (findAnswer[i - 1][j] + ints[j - 1]) % 1000000007;
                    }
                }


                if (i == findAnswer.length - 1 && j == ints.length - 1) {
                    answer = ints[j];
                }
                //end 웅덩이조건
            }
        }

        for (int[] ints : findAnswer) {
            System.out.println(Arrays.toString(ints));
        }
        return answer;
    }

    private void sort(int[][] puddles) {
        Arrays.sort(puddles, (o1, o2) -> {
            if (o1[1] > o2[1]) {
                return 1;
            } else if (o1[1] < o2[1]) {
                return -1;
            } else {
                return o1[0] > o2[0] ? 1 : -1;
            }
        });
    }

    public int solution2(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] findAnswer = new int[n + 1][m + 1];

        //시작위치를 1로 초기화
        findAnswer[1][1] = 1;
        //웅덩이들 -1로 초기화
        for (int[] puddle : puddles) {
            findAnswer[puddle[1]][puddle[0]] = -1;
        }

        for (int i = 1; i < findAnswer.length; i++) {
            for (int j = 1; j < findAnswer[i].length; j++) {
                // 웅덩이는 0 으로 바꾸고 넘어간다.
                if (findAnswer[i][j] == -1) {
                    findAnswer[i][j] = 0;
                } else {
                    if (i == 1) {
                        findAnswer[i][j] += findAnswer[i][j - 1];
                    } else {
                        findAnswer[i][j] = (findAnswer[i - 1][j] + findAnswer[i][j - 1]) % 1000000007;
                    }
                }

                //마지막 값 answer
                if (j == findAnswer[i].length - 1) {
                    answer = findAnswer[i][j];
                }
            }
        }
        return answer;
    }
}
