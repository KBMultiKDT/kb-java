package _0620_class_basic.basic_q4_class;

public class Main {
    public static void main(String[] args) {
        // 메뉴 아이템 생성
        MenuItem item1 = new MenuItem("아메리카노", 3000);
        MenuItem item2 = new MenuItem("카페라떼", 3500);
        MenuItem item3 = new MenuItem("치즈케이크", 5000);

        // 주문 생성
        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item3);

        Order order2 = new Order();
        order2.addItem(item2);
        order2.addItem(item3);

        // 주문 관리자 생성
        OrderManager manager = new OrderManager();
        manager.addOrder(order1);
        manager.addOrder(order2);

        // 총 매출 출력
        System.out.println("총 매출: " + manager.getTotalSales() + "원");

        //주문 메뉴 총 출력
        System.out.println("메뉴 출력: ");
        order1.getItems();
        order2.getItems();
    }
}
