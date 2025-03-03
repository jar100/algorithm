package study.strategy;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void 전략패턴() {
        Car car = new Car("레드", new TireStrategy() {
            @Override
            public void Accelerators() {
                System.out.println("눈이 와도 잘 달리는 윈터타이어");
            }

            @Override
            public void brake() {
                System.out.println("눈이 많이와도 잘멈춘다.");
            }
        });
        car.run();

        Car car2 = new Car("블루", new TireStrategy() {
            @Override
            public void Accelerators() {
                System.out.println("기본타이어~");
            }

            @Override
            public void brake() {
                System.out.println("눈이 오거나 비가올 땐 위험해~");
            }
        });
        car2.run();
    }
}