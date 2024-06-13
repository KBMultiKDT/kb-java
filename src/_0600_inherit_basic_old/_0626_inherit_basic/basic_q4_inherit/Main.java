package _0600_inherit_basic_old._0626_inherit_basic.basic_q4_inherit;

public class Main {
    public static void main(String[] args) {
        // 스레드 1: 글자 A 경주
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(100); // 0.1초마다 업데이트
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 스레드 2: 글자 B 경주
        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(150); // 0.15초마다 업데이트
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 스레드 3: 글자 C 경주
        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("C");
                try {
                    Thread.sleep(200); // 0.2초마다 업데이트
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 스레드 실행
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
