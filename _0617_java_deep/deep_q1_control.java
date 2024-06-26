package _0617_java_deep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deep_q1_control {
        private static int countIu = 0;
        private static int countFromis9 = 0;
        private static int countStayc = 0;

        public static void main(String[] args) {
            JFrame frame = new JFrame("Popular Song Voting");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new GridLayout(5, 1));

            JLabel label = new JLabel("Select your favorite song:");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(label);

            JButton button1 = new JButton("아이유 - LILAC");
            JButton button2 = new JButton("프로미스나인 - We Go");
            JButton button3 = new JButton("스테이씨 - ASAP");
            JButton endButton = new JButton("종료");

            button1.setBackground(new Color(255, 182, 193)); // Light Pink
            button2.setBackground(new Color(173, 216, 230)); // Light Blue
            button3.setBackground(new Color(144, 238, 144)); // Light Green
            endButton.setBackground(new Color(255, 215, 0)); // Gold

            button1.setFont(new Font("Arial", Font.BOLD, 16));
            button2.setFont(new Font("Arial", Font.BOLD, 16));
            button3.setFont(new Font("Arial", Font.BOLD, 16));
            endButton.setFont(new Font("Arial", Font.BOLD, 16));

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    countIu++;
                    JOptionPane.showMessageDialog(frame, "You voted for 아이유 - LILAC");
                }
            });

            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    countFromis9++;
                    JOptionPane.showMessageDialog(frame, "You voted for 프로미스나인 - We Go");
                }
            });

            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    countStayc++;
                    JOptionPane.showMessageDialog(frame, "You voted for 스테이씨 - ASAP");
                }
            });

            endButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,
                            "투표 결과:\n" +
                                    "아이유 - LILAC: " + countIu + "표\n" +
                                    "프로미스나인 - We Go: " + countFromis9 + "표\n" +
                                    "스테이씨 - ASAP: " + countStayc + "표");
                    System.exit(0);
                }
            });

            frame.add(button1);
            frame.add(button2);
            frame.add(button3);
            frame.add(endButton);

            frame.setVisible(true);
        }
    }

