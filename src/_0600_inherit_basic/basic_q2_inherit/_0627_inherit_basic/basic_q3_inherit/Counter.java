package _0600_inherit_basic.basic_q2_inherit._0627_inherit_basic.basic_q3_inherit;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
    }
}

