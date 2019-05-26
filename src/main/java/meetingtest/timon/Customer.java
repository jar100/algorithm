package meetingtest.timon;

public class Customer {
    private static final int FINISH_TIME = 11;
    private static final int FINISH_WEIGHTING_TIME = 60;
    private int weighting = 0;
    private int eatTime = 0;
    private boolean finishFood = false;
    public Customer() {
    }

    public boolean isLeaveTime() {
        if (weighting > FINISH_WEIGHTING_TIME) {
            return true;
        }
        return false;
    }

    public void addTime() {
        weighting ++;
    }

    public void eat() {

        if (eatTime >= FINISH_TIME)  {
            finishFood = true;
        }
        eatTime ++;

    }

    public boolean finishEat() {
        return finishFood;
    }
}
