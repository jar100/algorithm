package meetingtest.timon;

public class Table {
    private Customer customer;
    private Cook cook;
    private Cleaner cleaner;
    private boolean isHaveFood = false;
    private boolean isNeedClean = false;



    public Table sit(Customer customer) {
        this.customer = customer;
        return this;
    }

    public boolean isClean() {
        if (customer == null && !isHaveFood && cook == null && cleaner == null && !isNeedClean) {
            return true;
        }
        return false;
    }

    public boolean needCook() {
        if ( (cook == null && !isHaveFood) && (cleaner == null && !isNeedClean)) {
            return true;
        }
        return false;
    }

    public boolean hasCustomer() {
        if (customer == null) {
            return false;
        }
        return true;
    }

    public void addTime() {
        if (cook != null && !isHaveFood) {
            cook.startCook();
            if (cook.finishCook()) {
                isHaveFood = true;
            }
        }

        if (isHaveFood) {
            customer.eat();
        }

        if (cleaner != null && isNeedClean) {
            cleaner.startClean();
        }

    }

    public boolean isCleanerFinish() {
        if (cleaner.finishTable()) {
            this.isNeedClean = false;
            return true;
        }
        return false;
    }

    public int customerFinishFood() {
        if (customer.finishEat()) {
            this.customer = null;
            this.isHaveFood = false;
            this.isNeedClean = true;
            return 1;
        }
        return 0;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }


    public boolean hasFood() {
        return isHaveFood;
    }

    public Cook getCook() {
        return cook;
    }



    public boolean needCleaner() {
        if (cleaner == null && isNeedClean) {
            return true;
        }
        return false;
    }

    public Cleaner getCleaner() {
        cleaner.finishJob();
        return cleaner;
    }

    public boolean hasCleaner() {
        if (cleaner == null) {
            return false;
        }
        return true;
    }
}
