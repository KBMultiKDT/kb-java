package _0617_java_deep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class deep_q2_control {
        private static int totalGames = 0;
        private static int player1Wins = 0;
        private static int player2Wins = 0;

        public static void main(String[] args) {
            JFrame frame = new JFrame("Number Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new GridLayout(4, 1));

            // 프레임 배경 색상 설정
            frame.getContentPane().setBackground(new Color(240, 240, 240));

            JLabel label = new JLabel("게임을 계속 하시겠습니까?");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(label);

            JButton yesButton = new JButton("계속");
            JButton noButton = new JButton("종료");
            yesButton.setOpaque(true);
            noButton.setOpaque(true);

            yesButton.setBackground(new Color(144, 238, 144)); // Light Green
            noButton.setBackground(new Color(255, 182, 193)); // Light Pink

            yesButton.setFont(new Font("Arial", Font.BOLD, 16));
            noButton.setFont(new Font("Arial", Font.BOLD, 16));

            yesButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    playGame(frame);
                }
            });

            noButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,
                            "총 게임 수: " + totalGames + "\n" +
                                    "첫 번째 사람이 이긴 수: " + player1Wins + "\n" +
                                    "두 번째 사람이 이긴 수: " + player2Wins);
                    System.exit(0);
                }
            });

            frame.add(yesButton);
            frame.add(noButton);

            frame.setVisible(true);
        }

        private static void playGame(JFrame frame) {
            String player1Input = JOptionPane.showInputDialog(frame, "첫 번째 사람이 숫자를 입력하세요:");
            String player2Input = JOptionPane.showInputDialog(frame, "두 번째 사람이 숫자를 입력하세요:");

            try {
                int player1Number = Integer.parseInt(player1Input);
                int player2Number = Integer.parseInt(player2Input);

                totalGames++;

                if (player1Number > player2Number) {
                    player1Wins++;
                    JOptionPane.showMessageDialog(frame, "첫 번째 사람이 이겼습니다!");
                } else if (player1Number < player2Number) {
                    player2Wins++;
                    JOptionPane.showMessageDialog(frame, "두 번째 사람이 이겼습니다!");
                } else {
                    JOptionPane.showMessageDialog(frame, "비겼습니다!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "유효한 숫자를 입력하세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
