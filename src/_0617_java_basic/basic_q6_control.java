package _0617_java_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q6_control {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(Color.GREEN);

        Font font = new Font("맑은 고딕", Font.BOLD, 20);
        // 먹고 싶은 음식 입력
        JLabel foodLabel = new JLabel("먹고 싶은 음식 입력:");
        frame.add(foodLabel);
        foodLabel.setFont(font);

        JTextField foodField = new JTextField(10);
        frame.add(foodField);
        foodField.setFont(font);

        JButton foodButton = new JButton("어디로 갈까?");
        frame.add(foodButton);
        foodButton.setFont(font);
        foodButton.setBackground(Color.pink);
        foodButton.setOpaque(true);
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
        ageLabel.setFont(font);

        JTextField ageField = new JTextField(10);
        frame.add(ageField);
        ageField.setFont(font);

        JButton ageButton = new JButton("나의 내년 나이는?");
        frame.add(ageButton);
        ageButton.setFont(font);
        ageButton.setBackground(Color.yellow);

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
        koreanLabel.setFont(font);

        JTextField koreanField = new JTextField(10);
        frame.add(koreanField);
        koreanLabel.setFont(font);

        JLabel mathLabel = new JLabel("수학 점수 입력:");
        frame.add(mathLabel);
        mathLabel.setFont(font);

        JTextField mathField = new JTextField(10);
        frame.add(mathField);
        mathField.setFont(font);

        JButton scoreButton = new JButton("두 과목 점수의 평균은?");
        frame.add(scoreButton);
        scoreButton.setFont(font);
        scoreButton.setBackground(Color.ORANGE);

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
