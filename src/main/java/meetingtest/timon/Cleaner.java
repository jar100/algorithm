package meetingtest.timon;

public class Cleaner {
    private static final int FINISH_TIME = 3;

    private int cleanTime = 0;

    public boolean finishTable() {
        if (cleanTime == FINISH_TIME) {
            return true;
        }
        return false;
    }

    public void startClean() {
        cleanTime ++;
    }

    public void finishJob() {
       cleanTime = 0;
    }
}
