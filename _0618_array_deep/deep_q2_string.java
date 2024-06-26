package _0618_array_deep;

import java.util.Scanner;

public class deep_q2_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 전화번호 입력 받기
        System.out.print("전화번호를 입력하세요: ");
        String input = scanner.nextLine();

        // 공백을 제거한 문자가 전화번호 형식인지 확인
        boolean isValidPhoneNumberFormat = input.matches("\\d{3}-\\d{3,4}-\\d{4}");

        if (!isValidPhoneNumberFormat) {
            System.out.println("유효하지 않은 전화번호 형식입니다.");
            scanner.close();
            return;
        }

        // 1. 양쪽 공백 제거
        input = input.trim();

        // 2. -을 기준으로 String[]로 분리
        String[] parts = input.split("-");

        // 3. 첫번째 문자열에 따라 제조사 결정
        String manufacturer;
        if (parts[0].equals("011")) {
            manufacturer = "SK";
        } else if (parts[0].equals("019")) {
            manufacturer = "LG";
        } else {
            manufacturer = "Apple";
        }

        // 4. 두번째 문자열의 길이에 따라 폰 종류 결정
        String phoneType = (parts[1].length() >= 4) ? "최신폰" : "올드폰";

        // 5. 전체 전화번호 길이에 따라 유효성 검사
        String validity = (input.length() >= 10) ? "유효한 전화번호" : "유효하지 않은 전화번호";

        // 결과 출력
        System.out.println("처리된 전화번호: " + input);
        System.out.println("제조사: " + manufacturer);
        System.out.println("폰 종류: " + phoneType);
        System.out.println("전화번호 유효성: " + validity);

        scanner.close();
    }
}