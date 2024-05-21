package _0617_java_basic.basic_q2_oper;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}