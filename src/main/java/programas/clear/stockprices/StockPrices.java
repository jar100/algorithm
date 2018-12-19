package programas.clear.stockprices;

public class StockPrices {
    public static int[] solution(int[] prices) {
        int size = prices.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            int time = 0;
            for (int j = i; j < size - 1; j++) {
                if (prices[i] > prices[j]) {
                    break;
                }
                time++;
            }
            answer[i] = time;
        }

        return answer;
    }
}
