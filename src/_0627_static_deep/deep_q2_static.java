package _0627_static_deep;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deep_q2_static {

        private static int clickCount = 0;

        public static void main(String[] args) {
            ClickCounterGUI.showGUI();
        }

        public static void incrementCount() {
            clickCount++;
        }

        public static int getCount() {
            return clickCount;
        }
    }

    class ClickCounterGUI {
        public static void showGUI() {
            JFrame frame = new JFrame("Button Click Counter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JLabel label = new JLabel("Button clicked 0 times", SwingConstants.CENTER);
            label.setFont(new Font("Serif", Font.BOLD, 20));
            frame.add(label, BorderLayout.CENTER);

            JButton button = new JButton("Click Me!");
            button.setFont(new Font("Serif", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setForeground(Color.RED);
            frame.add(button, BorderLayout.SOUTH);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    deep_q2_static.incrementCount();
                    label.setText("Button clicked " + deep_q2_static.getCount() + " times");
                }
            });

            frame.setVisible(true);
        }
    }
