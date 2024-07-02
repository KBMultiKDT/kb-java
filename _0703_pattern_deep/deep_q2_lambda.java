package _0703_pattern_basic;

@FunctionalInterface
interface Play {
    void dance(String name);
}

@FunctionalInterface
interface Play2 {
    void drink(String name, int price, int count);
}

class Girl {
    public void action(Play play) {
        play.dance("발레");
    }

    public void action2(Play2 play2) {
        play2.drink("발레", 1000, 2);
    }
}

public class deep_q2_lambda {
    public static void main(String[] args) {
        Girl girl = new Girl();

        girl.action(name -> System.out.println(name + "할 때는 white드레스를 입는다."));

        girl.action2((name, price, count) -> System.out.println("나는 매일 " + name + " 후 " + price + "원짜리 음료 " + count + "개를 " + (price * count) + "원을 주고 사먹는다."));
    }
}


