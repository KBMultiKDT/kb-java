package _0600_inherit_basic_old.basic_q2_inherit;

// 슈퍼맨사용 클래스
public class SupermanUse {
    public SupermanUse() {
        // 기본 생성자
    }

    public static void main(String[] args) {
        Superman superman = new Superman();
        superman.name = "클라크 켄트";
        superman.age = 30;
        superman.power = 100;
        superman.sky = true;

        superman.eat();
        superman.run();
        superman.space();

        System.out.println(superman.toString());
    }
}
