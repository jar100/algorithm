package study;

import org.junit.Test;

public class VolatileTest {

    @Test
    public void name() throws Exception {
        class MyVolatile {

            int count;
            boolean ready = false;

            public MyVolatile(int count) {
                this.count = count;
            }

            public void counting() {
                count++;
            }
        }

        class VolatileThread implements Runnable {
            private MyVolatile myVolatile;
            private String name;
            private int anInt;
            public VolatileThread(MyVolatile myVolatile, String name) {
                this.myVolatile = myVolatile;
                this.name = name;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        myVolatile.count ++;
                        System.out.println(name + " : " + myVolatile.count );
                        System.out.println(name + " : " + myVolatile.ready );
                        myVolatile.ready = true;
                        Thread.sleep(5000);
                        myVolatile.ready = false;
                        System.out.println(name + " : 참조" + myVolatile.ready );

                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }


        MyVolatile myVolatile = new MyVolatile(1);




        Thread thread1 = new Thread(new VolatileThread(myVolatile, "thread 1"));
        Thread thread2 = new Thread(new VolatileThread(myVolatile, "thread 2") {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                        if (myVolatile.ready) {
                            Thread.sleep(4000);
                            System.out.println("thread 2" + " : " + myVolatile.count +  " , nonVolatileCount : " + myVolatile);
                        }
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(1000000);
    }
}
