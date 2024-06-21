package _0708_lambda_deep.deep_q3_reflection;

import java.lang.reflect.Field;

public class Main {

        public static void main(String[] args) {

            try {
                Class<?> clazz = Class.forName("_0708_lambda_deep.deep_q3_reflection.Person");
                Object person = clazz.newInstance();  // Person 인스턴스 생성

                Field nameField = clazz.getDeclaredField("name");
                nameField.setAccessible(true);  // private 필드 접근 허용
                nameField.set(person, "John");

                Field ageField = clazz.getDeclaredField("age");
                ageField.setAccessible(true);
                ageField.set(person, 30);

                System.out.println(person);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




