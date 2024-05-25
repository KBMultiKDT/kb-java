package _0620_class_basic.basic_q4_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<Item> menu = new ArrayList<>();
        Order order = new Order();

        Item burger = new Item();
        burger.setName("Burger");
        burger.setPrice(5.99);
        menu.add(burger);

        Item fries = new Item();
        fries.setName("Fries");
        fries.setPrice(2.99);
        menu.add(fries);

        Item soda = new Item();
        soda.setName("Soda");
        soda.setPrice(1.99);
        menu.add(soda);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("주문 가능한 메뉴입니다.");
            System.out.println("=======================");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println(menu.get(i).getName() + ": $" + menu.get(i).getPrice());
            }
            System.out.println();
            System.out.println("메뉴를 입력 (or 'x' to finish): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("x")) {
                break;
            }
            boolean found = false;
            for (Item item : menu) {
                if (item.getName().equalsIgnoreCase(choice)) {
                    order.addItem(item);
                    System.out.println("Added " + item.getName() + " to the order.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Item not found in the menu.");
            }
        }
        scanner.close();

        System.out.println("\nYour order:");
        order.displayOrder();
        System.out.println("Total items ordered: " + order.getItemCount());
    }
}
