package _0701_casting_basic;

import java.util.HashMap;
import java.util.Map;

public class basic_q2_casting {
    public static void main(String[] args) {
        // 고객 정보를 저장하는 HashMap 초기화
        Map<Integer, String> customers = new HashMap<>();
        customers.put(100, "김데이");
        customers.put(200, "김사전");
        customers.put(300, "김구조");
        customers.put(400, "김자료");

        // 특정 고객 정보 업데이트
        customers.remove(200); // 200번 고객 탈퇴 처리
        customers.put(300, "김충성"); // 300번 고객 이름 변경

        // 전체 고객 리스트 출력
        System.out.println("고객의 전체 리스트:");
        for (Map.Entry<Integer, String> entry : customers.entrySet()) {
            System.out.println("고객 번호: " + entry.getKey() + ", 이름: " + entry.getValue());
        }
    }
}
