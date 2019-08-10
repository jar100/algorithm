package study.javainaction;


import java.util.Objects;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public void setCalories(final int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    public enum Type {
        MEAT, FISH, OTHER
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Dish dish = (Dish) o;
        return vegetarian == dish.vegetarian &&
                calories == dish.calories &&
                Objects.equals(name, dish.name) &&
                type == dish.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vegetarian, calories, type);
    }
}
