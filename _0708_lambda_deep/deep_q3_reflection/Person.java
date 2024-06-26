package _0708_lambda_deep.deep_q3_reflection;

class Person {
    private String name;
    private int age;

    public Person() {}  // 기본 생성자

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

