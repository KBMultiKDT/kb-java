package _0626_inherit_deep.deep_q2_inherit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable {
    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + taskName + " is running");
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - " + taskName + " is completed");
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task " + i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}
