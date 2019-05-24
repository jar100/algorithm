package meetingtest.timon;

import org.junit.Test;
import programas.BaseTest;

import static org.junit.Assert.*;

public class RestaurantSimulationTest extends BaseTest {

    RestaurantSimulation restaurantSimulation = new RestaurantSimulation();


    @Test
    public void setup() {

        /*
         *
         * 120 분 5명씩 요리는 5명 요리시간 4분 청소시간 3분 먹는시간 11분  고객들이 밥을 다먹을 때까지 총 18분 하지만 10분부터옴
         *
         * 첫손님 이 온 110부터시작
         *  2명 남고 5먹으러 들어감
         *  18분이 지나고 5명이 다먹음
         *  현제 시각 92분 다시 5명 들어감
         *
         * */
        restaurantSimulation.setup(2,5,5,5);
        restaurantSimulation.run();
    }

    @Test
    public void setup2() {

        restaurantSimulation.setup(1,5,5,5);
        restaurantSimulation.run();
    }
}