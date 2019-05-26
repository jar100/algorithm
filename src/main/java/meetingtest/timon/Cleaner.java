package meetingtest.timon;

public class Cleaner {
    private int finishTime = 3;

    private int cleanTime = 0;

    public boolean finishTable() {
        if (cleanTime == finishTime) {
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
