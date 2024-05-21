package _0617_java_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q6_control {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // 먹고 싶은 음식 입력
        JLabel foodLabel = new JLabel("먹고 싶은 음식 입력:");
        frame.add(foodLabel);

        JTextField foodField = new JTextField();
        frame.add(foodField);

        JButton foodButton = new JButton("어디로 갈까?");
        frame.add(foodButton);

        foodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String food = foodField.getText();
                if ("아메리카노".equalsIgnoreCase(food)) {
                    JOptionPane.showMessageDialog(frame, "카페로 가세요.");
                } else {
                    JOptionPane.showMessageDialog(frame, "그러면 물을 마셔요.");
                }
            }
        });

        // 당신의 나이 입력
        JLabel ageLabel = new JLabel("당신의 나이 입력:");
        frame.add(ageLabel);

        JTextField ageField = new JTextField();
        frame.add(ageField);

        JButton ageButton = new JButton("나의 내년 나이는?");
        frame.add(ageButton);

        ageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int age = Integer.parseInt(ageField.getText());
                    JOptionPane.showMessageDialog(frame, "나의 내년 나이는: " + (age + 1) + "살");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "숫자를 입력하세요.");
                }
            }
        });

        // 국어, 수학 점수 각각 입력
        JLabel koreanLabel = new JLabel("국어 점수 입력:");
        frame.add(koreanLabel);

        JTextField koreanField = new JTextField();
        frame.add(koreanField);

        JLabel mathLabel = new JLabel("수학 점수 입력:");
        frame.add(mathLabel);

        JTextField mathField = new JTextField();
        frame.add(mathField);

        JButton scoreButton = new JButton("두 과목 점수의 평균은?");
        frame.add(scoreButton);

        scoreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int koreanScore = Integer.parseInt(koreanField.getText());
                    int mathScore = Integer.parseInt(mathField.getText());
                    double average = (koreanScore + mathScore) / 2.0;
                    JOptionPane.showMessageDialog(frame, "두 과목 점수의 평균은: " + average + "점");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "숫자를 입력하세요.");
                }
            }
        });

        frame.setVisible(true);
    }
}
