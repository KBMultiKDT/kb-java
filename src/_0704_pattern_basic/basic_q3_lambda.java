package _0704_pattern_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Play{
    void dance(String name);
}
@FunctionalInterface
interface Play2{
    void drink(String name, int price, int count);
}


class Girl{
    public void action(Play play) {
        play.dance("발레");
    }

    public void action2(Play2 play2){
        play2.drink("발레", 1000, 2);
    }

}
public class basic_q3_lambda {

    public static void main(String[] args) {
                       // 결과 출력
        // Girl 객체 생성
        Girl girl = new Girl();

        // action 메소드 호출
        girl.action(name -> System.out.println(name + "할 때는 white 드레스를 입는다."));

        // action2 메소드 호출
        girl.action2((name, price, count) -> System.out.println("나는 매일 " + name + " 후 " + price + "원짜리 음료 " + count + "개를 " + (price * count) + "원을 주고 사먹는다."));
    }
}
