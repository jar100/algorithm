package study.collections;

import java.util.Objects;

public class Car {
    private String color;
    private int number;


    public Car(int number) {
        this.color = "null";
        this.number = number;
    }

    public Car(String name, int number) {
        this.color = name;
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, number);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
