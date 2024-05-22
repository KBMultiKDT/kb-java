package _0619_class_basic.basic_q4_class;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void getItems() {
        String total = "";
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getName() + " ";
        }
        System.out.println(total);
    }
}
