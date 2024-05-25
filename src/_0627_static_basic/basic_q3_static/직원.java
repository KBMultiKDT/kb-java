package _0627_static_basic.basic_q3_static;

public class 직원 {
    private String name;
    private int age;
    private String gender;

    private static int totalEmployees = 0;
    private static int totalAge = 0;

    public 직원(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

        totalEmployees++;
        totalAge += age;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double getAverageAge() {
        return (double) totalAge / totalEmployees;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age + ", 성별: " + gender;
    }
}
