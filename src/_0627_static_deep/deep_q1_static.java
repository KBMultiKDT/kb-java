package _0627_static_deep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class deep_q1_static {
        private static final Random rand = new Random();

        public static void main(String[] args) {
            RandomColorChangerGUI.showGUI();
        }

        public static Color getRandomColor() {
            return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        }
    }

    class RandomColorChangerGUI {
        public static void showGUI() {
            JFrame frame = new JFrame("Random Color Changer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JLabel label = new JLabel("Press the button to change my color", SwingConstants.CENTER);
            label.setOpaque(true);
            label.setFont(new Font("Serif", Font.BOLD, 20));
            label.setBackground(Color.WHITE);
            frame.add(label, BorderLayout.CENTER);

            JButton button = new JButton("Change Color");
            button.setFont(new Font("Serif", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setForeground(Color.MAGENTA);
            frame.add(button, BorderLayout.SOUTH);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setBackground(deep_q1_static.getRandomColor());
                }
            });

            frame.setVisible(true);
        }
    }

