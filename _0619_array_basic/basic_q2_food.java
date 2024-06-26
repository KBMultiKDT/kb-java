package _0619_array_basic;


import java.util.Scanner;

public class basic_q2_food {
    private static final int CHICKEN_PRICE = 2000;
    private static final int BAGUETTE_PRICE = 3500;
    private static int totalChicken = 0;
    private static int totalBaguette = 0;
    private static int totalCost = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴를 선택하세요 (1: 샐러드치킨, 2: 바게트, 0: 주문 종료):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("주문을 종료합니다.");
                break;
            } else {
                System.out.println("수량을 입력하세요:");
                int quantity = scanner.nextInt();

                switch (choice) {
                    case 1:
                        totalChicken += quantity;
                        totalCost += CHICKEN_PRICE * quantity;
                        break;
                    case 2:
                        totalBaguette += quantity;
                        totalCost += BAGUETTE_PRICE * quantity;
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                        continue;
                }

                // 현재 주문 상황 출력
                System.out.println("현재 주문 상황:");
                System.out.println("샐러드치킨: " + totalChicken + "개");
                System.out.println("바게트: " + totalBaguette + "개");
            }
        }

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalCost + "원");
        scanner.close();
    }
}