package _0625_static_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q4_static {
        private static int currentIndex = 0;
        private static final String[] imagePaths = {
                "image/image11.png",
                "image/image22.png",
                "image/image33.png"
        };

        public static void main(String[] args) {
            JFrame frame = new JFrame("Image Switcher");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());

            JLabel imageLabel = new JLabel();
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            updateImage(imageLabel);
            frame.add(imageLabel, BorderLayout.CENTER);

            JButton button = new JButton("Next Image");
            button.setFont(new Font("Serif", Font.BOLD, 20));
            button.setBackground(Color.ORANGE);
            button.setForeground(Color.BLUE);
            frame.add(button, BorderLayout.SOUTH);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentIndex = (currentIndex + 1) % imagePaths.length;
                    updateImage(imageLabel);
                }
            });

            frame.setVisible(true);
        }

        private static void updateImage(JLabel label) {
            ImageIcon icon = new ImageIcon(imagePaths[currentIndex]);
            label.setIcon(icon);
        }
    }
