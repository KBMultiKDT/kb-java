package _0626_inherit_deep.deep_q1_inherit;

import javax.swing.*;
import java.awt.*;

public class CircleAnimation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        CirclePanel circlePanel1 = new CirclePanel(Color.RED);
        CirclePanel circlePanel2 = new CirclePanel(Color.BLUE);
        CirclePanel circlePanel3 = new CirclePanel(Color.GREEN);

        circlePanel1.setBounds(0, 0, 400, 400);
        circlePanel2.setBounds(0, 0, 400, 400);
        circlePanel3.setBounds(0, 0, 400, 400);

        frame.add(circlePanel1);
        frame.add(circlePanel2);
        frame.add(circlePanel3);

        frame.setVisible(true);

        Thread thread1 = new Thread(circlePanel1);
        Thread thread2 = new Thread(circlePanel2);
        Thread thread3 = new Thread(circlePanel3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}