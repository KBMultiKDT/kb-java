package _0600_inherit_basic._0626_inherit_basic.basic_q2_inherit;

// 슈퍼맨 클래스
public class Superman extends Man {
    boolean sky;

    public Superman() {
        // 기본 생성자
    }

    public void space() {
        System.out.println(name + "이(가) 우주를 날아갑니다.");
    }

    @Override
    public void run() {
        System.out.println(name + "이(가) 빠르게 달립니다.");
    }

    @Override
    public String toString() {
        return "슈퍼맨 [name=" + name + ", age=" + age + ", power=" + power + ", sky=" + sky + "]";
    }
}

