package _0619_class_basic.basic_q4_class;

// MenuItem 클래스: 메뉴 아이템을 나타내는 클래스
public class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

