package _0617_java_deep;

public class deep_q2_control {
    public static void main(String[] args) {
        // 개인 정보 변수 선언
        String name = "John Doe";
        byte age = 30;
        int mathJumsu = 100;
        float height = 175.5F; // cm 단위
        double weight = 70.2;  // kg 단위
        String address = "123 Main St, Anytown, USA";
        String phoneNumber = "010-1234-5678";
        char gender = 'F';

        // 출력
        System.out.println("===== 개인 정보 =====");
        System.out.printf("이름      : %s%n", name);
        System.out.printf("나이      : %d세%n", age);
        System.out.printf("키        : %.1fcm%n", height);
        System.out.printf("몸무게    : %.1fkg%n", weight);
        System.out.printf("주소      : %s%n", address);
        System.out.printf("전화번호  : %s%n", phoneNumber);
        String result =  gender == 'F' ? "여성" : "남성";
        System.out.printf("성별  : %s%n", result);
        System.out.printf("수학점수  : %s점%n", mathJumsu);
    }
}