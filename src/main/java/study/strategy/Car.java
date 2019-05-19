package study.strategy;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) &&
                Objects.equals(tire, car.tire);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(tire);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", tire=" + tire +
                '}';
    }
}
