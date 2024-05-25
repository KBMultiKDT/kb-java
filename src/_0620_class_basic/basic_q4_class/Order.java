package _0620_class_basic.basic_q4_class;

import java.util.ArrayList;
import java.util.List;

class Order {
    List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        items.add(item);
    }

    double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    int getItemCount() {
        return items.size();
    }

    void displayOrder() {
        for (Item item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + getTotal());
    }
}
