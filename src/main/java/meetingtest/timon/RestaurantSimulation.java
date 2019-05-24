package meetingtest.timon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class RestaurantSimulation {
    List<Customer> weighting = new ArrayList<>();
    List<Table> tables = new ArrayList<>();
    List<Table> usingTables = new ArrayList<>();
    List<Cook> cooks = new ArrayList<>();
    List<Cleaner> cleaners = new ArrayList<>();
    int minute = 0;
    int FinishMinute;
    int customerCount = 0;


    public void setup(int time, int cook, int cleaner, int table) {
        FinishMinute = time * 60;
        for (int i = 0; i < cook; i++) {
            cooks.add(new Cook());
        }

        for (int i = 0; i < cleaner; i++) {
            cleaners.add(new Cleaner());
        }

        for (int i = 0; i < table; i++) {
            tables.add(new Table());
        }
    }


    public int run() {
        while (FinishMinute != minute) {
            cleanTables();
            weightingAddCustomer();
            customerSitTables();
            weighting.forEach(Customer::addTime);
            usingTablesAddTime();

            minute++;
        }

        System.out.println("밥먹은사람: " + customerCount);
        return customerCount;
    }

    private void weightingAddCustomer() {
        if (minute % 10 == 0 && minute != 0) {
            weighting.addAll(comeCustomer());
        }
    }


    public void usingTablesAddTime() {
        for (Table usingTable : usingTables) {

            // 사용중인 테이블중 담당 요리사가 없고 놀고있는 요리사가 있으면 들어간다.
            // todo 클린중에 사람이 들어가 요리사도 같이 들어가는 문제 발생 요리사와 사람은 같이 들어갈 수 있으나 청소부가 있으면 둘다 못들어온다.
            usingTableNeedCook(usingTable);


            // 사용하는 테이블에 시간을 부여한다 그래서 기본적으로 이걸 호출할대 테이블에 일하는 사람이 있어야한다.
            // 하지만 청소부는 사람이 빠져야 들어오는 방법 때문에 한번씩 밀리는 문제가 발생
            usingTable.addTime();

            countWhenCustomerFinishFood(usingTable);
            // 순서가 필요하다 위에서 커스터머가 삭제되면 바로 클리너를 할당하자.
            usingTableNeedCleaner(usingTable);
            addCleanerWhenFinishCleanTheTable(usingTable);
            addCookWhenFinishTheFood(usingTable);
        }
    }

    private void addCookWhenFinishTheFood(Table usingTable) {
        if (usingTable.hasFood()) {
            if (usingTable.getCook() != null) {
                cooks.add(usingTable.getCook());
                usingTable.setCook(null);
            }
        }
    }

    private void addCleanerWhenFinishCleanTheTable(Table usingTable) {
        if (usingTable.hasCleaner()) {
            if (usingTable.isCleanerFinish()) {
                cleaners.add(usingTable.getCleaner());
            }
        }
    }

    private void usingTableNeedCleaner(Table usingTable) {
        if (usingTable.needCleaner() && !cleaners.isEmpty()) {
            usingTable.setCleaner(cleaners.remove(0));

        }
    }

    private void countWhenCustomerFinishFood(Table usingTable) {
        if (usingTable.hasCustomer()) {
            customerCount += usingTable.isCustommerFinishFood();
        }
    }

    private void usingTableNeedCook(Table usingTable) {
        if (usingTable.needCook() && !cooks.isEmpty()) {
            usingTable.setCook(cooks.remove(0));
        }
    }

    public Queue<Customer> comeCustomer() {
        Queue<Customer> customers = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            customers.add(new Customer());
        }
        return customers;
    }

    public void cleanTables() {
        tables.addAll(usingTables.stream()
                .filter(Table::isClean)
                .collect(Collectors.toList()));

        usingTables = usingTables.stream().filter(table -> !table.isClean()).collect(Collectors.toList());
    }

    public void customerSitTables() {
        Customer customer;
        while (!weighting.isEmpty() && !tables.isEmpty()) {
            customer = weighting.remove(0);
            if (!customer.isLeaveTime()) {
                usingTables.add(tables.remove(0).seet(customer));
            }
        }
    }

}
