package programas;

import java.util.ArrayList;

public class JumpIronsuit {
    /*OO 연구소는 한 번에 K 칸을 앞으로 점프하거나,
    (현재까지 온 거리) x 2 에 해당하는 위치로 순간이동을 할 수 있는 특수한 기능을 가진 아이언 슈트를 개발하여 판매하고 있습니다.
    이 아이언 슈트는 건전지로 작동되는데,
    순간이동을 하면 건전지 사용량이 줄지 않지만, 앞으로 K 칸을 점프하면 K 만큼의 건전지 사용량이 듭니다.
    그러므로 아이언 슈트를 착용하고 이동할 때는 순간 이동을 하는 것이 더 효율적입니다.
    아이언 슈트 구매자는 아이언 슈트를 착용하고 거리가 N 만큼 떨어져 있는 장소로 가려고 합니다.
    단, 건전지 사용량을 줄이기 위해 점프로 이동하는 것은 최소로 하려고 합니다.
    아이언 슈트 구매자가 이동하려는 거리 N이 주어졌을 때,
    사용해야 하는 건전지 사용량의 최솟값을 return하는 solution 함수를 만들어 주세요.*/
    public int solution(int n) {
        int ans = 0;
        //n 에 10이 들어왔다.
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < n / 2; i++) {
            int battle = 0 ;
            battle += i;
            int moveStack = i;
            if (moveStack * 2 > n - moveStack) {

            }
        }
        return 0;
    }
}
