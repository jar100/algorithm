package study;

public class StaticTest {
    static class StaticClassTest {


        static {

            System.out.println(StaticClassTest.k);
            k = 2;
            System.out.println(StaticClassTest.k);
        }

        static int k = 1;

        public static void main(String[] args) {
            System.out.println(k);
        }
    }

    static class StaticClassTest2 {
        static {
            System.out.println("첫번째");
            System.out.println(StaticClassTest2.k);
            k = 2;
            System.out.println(StaticClassTest2.k);
        }

        static int k = 1;


        public static void main(String[] args) {
            System.out.println(k);
            //

            //test

        }


        static {
            System.out.println("두번째");
            System.out.println(StaticClassTest2.k);
            k = 10;
            System.out.println(StaticClassTest2.k);
        }

        static void run() {
            System.out.println("런을 통한 출력");
            System.out.println(k);
            k = 500;
        }
    }

    public static void main(String[] args) {

        System.out.println("한번");
        StaticClassTest2.run();
        System.out.println("두번");

    }
}
