package _0625_static_basic.basic_q5_static;

import java.util.Scanner;

public class DrinkApplication {

        private static Drink[] drinks = new Drink[]{
                new Drink("콜라", 1200, 10),
                new Drink("사이다", 1100, 10),
                new Drink("커피", 900, 10)
        };

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                printMenu();
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        showDrinks();
                        break;
                    case 2:
                        purchaseDrink(scanner);
                        break;
                    case 3:
                        running = false;
                        System.out.println("자판기를 종료합니다.");
                        break;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                }
            }
            scanner.close();
        }

        private static void printMenu() {
            System.out.println("\n자판기 메뉴");
            System.out.println("1. 음료 보기");
            System.out.println("2. 음료 구매");
            System.out.println("3. 종료");
            System.out.print("선택: ");
        }

        private static void showDrinks() {
            System.out.println("음료 목록:");
            for (int i = 0; i < drinks.length; i++) {
                Drink drink = drinks[i];
                System.out.printf("%d. %s (가격: %d원, 재고: %d개)\n", i + 1, drink.getName(), drink.getCost(), drink.getCount());
            }
        }

        private static void purchaseDrink(Scanner scanner) {
            showDrinks();
            System.out.print("구매할 음료 번호를 선택하세요: ");
            int drinkIndex = scanner.nextInt() - 1;
            if (drinkIndex >= 0 && drinkIndex < drinks.length) {
                Drink selectedDrink = drinks[drinkIndex];
                if (selectedDrink.getCount() > 0) {
                    selectedDrink.purchase();
                    System.out.printf("%s를 구매했습니다.\n", selectedDrink.getName());
                } else {
                    System.out.println("재고가 부족합니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
