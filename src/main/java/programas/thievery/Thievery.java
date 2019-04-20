package programas.thievery;

public class Thievery {
    public int solution(int[] money) {
        int answer = 0;
        // 배열이 들어옴

        int index = 0;
        while (index < money.length) {
            if (index + 3 < money.length) {
                int tempMoney = money[index + 2] > money[index + 3] ? money[index + 2] : money[index + 3];
                if (money[index] + tempMoney > money[index + 1] + money[index + 3]) {
                    answer += money[index];
                    index += 2;
                } else {
                    answer += money[index + 1];
                    index += 3;
                }
            } else if (index + 2 < money.length) {
                if (money[index] + money[index + 2] > money[index + 1]) {
                    answer += money[index];
                    index += 2;
                } else {
                    answer += money[index + 1];
                    index += 3;
                }
            } else if (index + 1 < money.length) {
                if (money[index] > money[index + 1]) {
                    answer += money[index];
                    index += 2;
                } else {
                    answer += money[index + 1];
                    index += 3;
                }
            } else {
                answer += money[index];
                index++;
            }
        }


        return answer;
    }
}
