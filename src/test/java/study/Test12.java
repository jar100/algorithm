package study;

public class Test12 {

    static {
        System.out.println("12313");
    }

    {
        System.out.println("12314a");
    }

    public Test12() {
        System.out.println("생성자");
    }


    public void b() {
        System.out.println("not Static");
    }

    public static void main(String[] args) {
        Test12 a = new Test12();
        a.b();
        Test12 b = new Test12();
        b.b();
    }
}

