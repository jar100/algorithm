package study;

public class Isp {
    public interface Animal {
        void eat();
        void cry();
    }

    public interface Bird {
        void fly();
    }

    public interface Mammal {
        void run();
    }

    public class Cat implements Animal,Mammal {
        @Override
        public void eat() {
            System.out.println("냠냠");
        }

        @Override
        public void cry() {
            System.out.println("냐옹");
        }

        @Override
        public void run() {
            System.out.println("사뿐사뿐");
        }
    }

    public class Parrot implements Animal,Bird {
        @Override
        public void eat() {
            System.out.println("쩝쩝");
        }

        @Override
        public void cry() {
            System.out.println("안녕");
        }

        @Override
        public void fly() {
            System.out.println("푸더더덕");
        }
    }
}
