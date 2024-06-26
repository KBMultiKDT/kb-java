package _0708_lambda_deep.deep_q3_reflection;

import java.lang.reflect.*;

public class Main {

        public static void main(String[] args) {

            try {
                Class<?> clazz = Class.forName("_0708_lambda_deep.deep_q3_reflection.Person");
                Method[] methods = clazz.getDeclaredMethods();

                for (Method method : methods) {
                    System.out.println("Method name: " + method.getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }




