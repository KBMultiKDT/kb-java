package _0708_crawl_basic;

public class basic_q2_thread {
    public static void main(String[] args) {
        // 스레드 1: 카운터 업데이트
        Thread counterThread = new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Counter: " + i);
                    try {
                        Thread.sleep(1000); // 1초마다 업데이트
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 카운트 종료 메시지 창 띄우기
                System.out.println("카운트가 종료되었습니다.");
            }
        };

        // 스레드 2: 현재 시간 표시
        Thread timeThread =  new Thread(){

            @Override
            public void run() {
                while (true) {
                    System.out.println("Current Time: " + java.time.LocalTime.now());
                    try {
                        Thread.sleep(1000); // 1초마다 업데이트
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        // 스레드 3: 이벤트 처리
        Thread eventThread =  new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Event " + i + ">> Award Trophy");
                    // 여기에 이벤트 처리 로직 추가
                    try {
                        Thread.sleep(1000); // 1초마다 업데이트
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // 스레드 실행
        counterThread.start();
        timeThread.start();
        eventThread.start();
    }
}
