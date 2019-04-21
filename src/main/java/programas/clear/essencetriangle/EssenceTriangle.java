package programas.clear.essencetriangle;

import java.util.Arrays;

public class EssenceTriangle {
    private int answer = 0;

    public int solution(int[][] triangle) {
        this.answer = 0;
        for (int i = 1; i < triangle.length; i++) {
            int previewMax = triangle[i - 1].length;
            int max = triangle[i].length;

            triangle[i][0] = compareAnswer(triangle[i][0] + triangle[i - 1][0]);
            for (int j = 1; j < previewMax; j++) {
                int left = triangle[i - 1][j - 1];
                int right = triangle[i - 1][j];
                if (left > right) {
                    triangle[i][j] = compareAnswer( left + triangle[i][j]);
                } else {
                    triangle[i][j] = compareAnswer( right + triangle[i][j]);
                }
            }
            triangle[i][max - 1] = compareAnswer(triangle[i][max - 1] + triangle[i - 1][previewMax - 1]);

        }
        return this.answer;
    }

    private int compareAnswer(int newAnswer) {
        if (this.answer < newAnswer) {
            this.answer = newAnswer;
        }
        return newAnswer;
    }
}
