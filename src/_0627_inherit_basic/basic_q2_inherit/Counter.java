package _0627_inherit_basic.basic_q2_inherit;

public class Counter {
    public static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                    System.out.println("t1 count>> " + count);
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                    System.out.println("t2 count>> " + count);
                }
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 200, Actual: " + getCount());
    }
}
