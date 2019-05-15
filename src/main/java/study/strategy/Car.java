package study.strategy;

public class Car {
    private String color;
    private TireStrategy tire;

    public Car(String color, TireStrategy tire) {
        this.color = color;
        this.tire = tire;
    }

    public void run() {
        tire.Accelerators();
        tire.brake();
    }
}
