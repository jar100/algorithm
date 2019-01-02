package programas.jumpsuit;

import java.util.ArrayList;
import java.util.Collections;

public class JumpIronsuit {
    public int solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n/2; i++) {
            Jumpsuit jumpsuit = new Jumpsuit();
            jumpsuit.jump(i);
            while (jumpsuit.getMoveingPoint() * 2 <= n) {
                jumpsuit.teleportation();
            }
            int addMove = n - jumpsuit.getMoveingPoint();
            jumpsuit.jump(addMove);
            result.add(jumpsuit.getBattery());
        }
        return Collections.min(result);
    }
    class Jumpsuit {
        int battery = 0;
        int moveingPoint = 0;

        public Jumpsuit() {
        }

        public void jump(int i) {
            battery += i;
            moveingPoint += i;
        }

        public void teleportation() {
            moveingPoint = moveingPoint *2;
        }

        public int getBattery() {
            return battery;
        }

        public int getMoveingPoint() {
            return moveingPoint;
        }
    }
}
