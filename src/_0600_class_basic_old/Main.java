package _0600_class_basic_old;

public class Main {
    public static void main(String[] args) {
        // 새로운 텔레비전 객체 생성
        Television tv = new Television();
        tv.manufacturer = "multi";
        tv.price = 1000;
        tv.size = "small";
        tv.retailer = "samsung";
        // 텔레비전 객체의 메서드 호출
        tv.powerOn();
        tv.changeChannel(7);
        tv.powerOff();
    }
}


