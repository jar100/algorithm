package study.collections;

import java.util.Objects;
import java.util.Optional;

public class Car {
    public static final Car EMPTY = new Car("없다",0) {
        @Override
        public String toString() {
            return "없다.";
        }
    };


    private String color;
    private int number;
    private Tire tire;


    public Car(int number) {
        this.color = "null";
        this.number = number;
        this.tire = new Tire("기본타이어");
    }

    public Car(String name, int number) {
        this.color = name;
        this.number = number;
    }

    public Car(final String color, final int number, final Tire tire) {
        this.color = color;
        this.number = number;
        this.tire = tire;
    }


    public Tire getTire() {
        return tire;
    }

    public Optional<Tire> getOptionalTire() {
        return Optional.ofNullable(this.tire);
    }

    public void setTire(final Tire tire) {
        this.tire = tire;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Car car = (Car) o;
        return number == car.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
