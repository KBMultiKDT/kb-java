package _0600_inherit_basic.basic_q1_inherit;

import javax.swing.*;
import java.awt.*;

public class MovingTextAnimation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Text Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MovingTextPanel textPanel = new MovingTextPanel("Hello, World!", Color.GREEN);
        frame.add(textPanel);

        frame.pack();
        frame.setVisible(true);

        Thread thread = new Thread(textPanel);
        thread.start();
    }
}
