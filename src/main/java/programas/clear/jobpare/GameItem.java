package programas.clear.jobpare;

import java.util.List;

public class GameItem implements Comparable<GameItem>{
    int index;
    int attackPoint;
    int minusHeath;
    boolean isUse = true;


    public GameItem(int index, int a, int b) {
        this.index = index;
        this.attackPoint = a;
        this.minusHeath = b;

    }

    public GameItem addList(List<Integer> a) {
        this.isUse = false;
        a.add(index + 1);
        return this;
    }

    public boolean isUse() {
        return isUse;
    }

    public int getMinusHeath() {
        return minusHeath;
    }

    @Override
    public String toString() {
        return "GameItem{" +
                "index=" + index +
                ", attackPoint=" + attackPoint +
                ", minusHeath=" + minusHeath +
                ", isUse=" + isUse +
                '}';
    }


    public int compareTo(GameItem o) {
        if (this.attackPoint < o.attackPoint) {
            return 1;
        } else if (this.attackPoint > o.attackPoint) {
            return -1;
        } else {
            return 0;
        }
    }
}
