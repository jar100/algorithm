
package programas.clear.jobpare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobPare3 {
    public int[] solution(int[] healths, int[][] items) {
        int[] answer;
        Arrays.sort(healths);
        List<Integer> answerList = new ArrayList<>();

        List<GameItem> items1 = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
//            items1.add(new GameItem(i, items[i][0], items[i][1]));
            items1.add(new GameItem(i,items[i][0], items[i][1]));
        }
        items1.sort(GameItem::compareTo);

        for (int health : healths) {
            for (GameItem gameItem : items1) {
                if (gameItem.isUse()) {
                    if (health - gameItem.getMinusHeath() >= 100) {
                        gameItem.addList(answerList);
                        System.out.println("사용 : " + gameItem);
                        break;
                    }
                }
            }

        }

        answer = answerList.stream().mapToInt(o1 -> o1).toArray();
        Arrays.sort(answer);
        return answer;
    }



}


