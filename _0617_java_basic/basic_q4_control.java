package _0617_java_basic;

import java.util.Scanner;

public class basic_q4_control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("여행 지역을 입력하세요: ");
        String travelDestination = scanner.nextLine();

        System.out.print("1인당 경비를 입력하세요: ");
        double costPerPerson = scanner.nextDouble();

        System.out.print("여행 인원을 입력하세요: ");
        int numberOfPeople = scanner.nextInt();

        System.out.print("할인율(%)을 입력하세요: ");
        double discountRate = scanner.nextDouble();

        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean isVip = scanner.nextBoolean();
        scanner.nextLine(); // 버퍼를 비우기 위해 사용

        System.out.print("당부의 말을 입력하세요: ");
        String remarks = scanner.nextLine();

        // 총 경비 계산
        double totalCost = costPerPerson * numberOfPeople;
        double finalDiscountRate = isVip ? discountRate + 5 : discountRate;
        double discountAmount = totalCost * (finalDiscountRate / 100);
        double discountedTotalCost = totalCost - discountAmount;

        // 결과 출력
        System.out.println("\n===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + travelDestination);
        System.out.println("1인당 경비: " + costPerPerson + "원");
        System.out.println("여행 인원: " + numberOfPeople + "명");
        System.out.println("기본 할인율: " + discountRate + "%");
        if (isVip) {
            System.out.println("VIP 추가 할인율: 5%");
        }
        System.out.println("최종 할인율: " + finalDiscountRate + "%");
        System.out.println("총 경비: " + totalCost + "원");
        System.out.println("할인 금액: " + discountAmount + "원");
        System.out.println("할인 후 총 경비: " + discountedTotalCost + "원");
        System.out.println("당부의 말: " + remarks);

        scanner.close();
    }
}
