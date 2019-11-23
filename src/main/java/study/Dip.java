package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dip {

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.init(new Bard());
        farm.check();
        farm.giveFood();

        farm.init(new Chicken());
        farm.check();
        farm.giveFood();
    }

    public static class Farm {
        private Animal animal;

        public void init(Animal animal) {
            this.animal = animal;
        }

        public void check() {
            animal.cry();
        }

        public void giveFood() {
            animal.eat();
        }
    }

    public interface Animal {
        void eat();
        void cry();
    }

    public static class Bard implements Animal {
        @Override
        public void eat() {
            System.out.println("콕콕콕");
        }

        @Override
        public void cry() {
            System.out.println("안녕");

        }
    }

    public static class Chicken implements Animal {
        @Override
        public void eat() {
            System.out.println("콕콕콕");
        }

        @Override
        public void cry() {
            System.out.println("꼬꼬");

        }
    }
}
