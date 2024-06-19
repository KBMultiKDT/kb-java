package _0620_class_basic.basic_q4_class;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Item[] menu = new Item[3];
        Item[] order = new Item[3];

        Item burger = new Item();
        burger.setName("Burger");
        burger.setPrice(5.99);
        menu[0] = burger;

        Item fries = new Item();
        fries.setName("Fries");
        fries.setPrice(2.99);
        menu[1] = fries;

        Item soda = new Item();
        soda.setName("Soda");
        soda.setPrice(1.99);
        menu[2] = soda;

        Scanner scanner = new Scanner(System.in);
        int count = 0;
       while (true){
            System.out.println("주문 가능한 메뉴입니다.");
            System.out.println("=======================");
            for (int j = 0; j < menu.length; j++) {
                System.out.println((j + 1) +  ">> " + menu[j].getName() + ": $" + menu[j].getPrice());
            }

            System.out.println();

            String choice = null;
            System.out.print("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x'입력 >> ");
            choice = scanner.next();

            if (count == 3) {
               System.out.println("프로그램을 종료합니다.");
               System.out.println("\nYour order:");
               for (int k = 0; k < order.length; k++) {
                    System.out.println(order[k].getName() + ": " + order[k].getPrice());
                }
               break;
            }else{
                    order[count] = menu[Integer.parseInt(choice) - 1];
                    count++;
            }
        }
        scanner.close();
    }
}
