package programas.essencetriangle;

public class EssenceTriangle {
    int answer = 0;

    public int solution(int[][] triangle) {
        for (int i = 1; i < triangle.length; i++) {
            int previewMax = triangle[i - 1].length;
            int max = triangle[i].length;

            triangle[i][0] = compareAnswer(answer, triangle[i][0] + triangle[i - 1][0]);
            for (int j = 1; j < previewMax; j++) {
                int left = triangle[i - 1][j - 1];
                int right = triangle[i - 1][j];
                if (left > right) {
                    triangle[i][j] = compareAnswer(answer, left + triangle[i][j]);
                } else {
                    triangle[i][j] = compareAnswer(answer, right + triangle[i][j]);
                }
            }
            triangle[i][max - 1] = compareAnswer(answer, triangle[i][max - 1] + triangle[i - 1][previewMax - 1]);

        }

        return answer;
    }

    private int compareAnswer(int answer, int newAnswer) {
        if (answer < newAnswer) {
            this.answer = newAnswer;
        }
        return newAnswer;
    }
}
