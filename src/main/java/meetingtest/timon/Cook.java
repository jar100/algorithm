package meetingtest.timon;

import java.util.Objects;

public class Cook {
    private int proficiency;
    private int finishTime = 4;
    private int cookTime;
    private boolean isStartCook = false;


    public void startCook() {
        if (!isStartCook) {
            isStartCook = true;
        }
        cookTime ++;
        proficiency ++;
    }

    public boolean finishCook() {
        if (isStartCook && cookTime == finishTime) {
            isStartCook = false;
            cookTime = 0;
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cook cook = (Cook) o;
        return cookTime == cook.cookTime &&
                isStartCook == cook.isStartCook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cookTime, isStartCook);
    }
}
