package _0600_array_basic_old;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q2_food {
        private static JLabel totalOrdersLabel;
        private static JLabel imageLabel;
        private static JLabel totalPriceLabel;

        private static int croissantCount = 0;
        private static int baguetteCount = 0;
        private static int sandwichCount = 0;
        private static final int ITEM_PRICE = 5000;

        private static String[] itemNames = {"크루아상", "바게트", "샌드위치"};
        private static String[] itemImages = {"img/path_to_croissant.png", "img/path_to_baguette.png", "img/path_to_sandwich.png"};

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setTitle("Bakery Order System");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.setBackground(new Color(240, 240, 240)); // Light gray color

            totalOrdersLabel = new JLabel("총 주문 개수: 0", JLabel.RIGHT);
            totalOrdersLabel.setFont(new Font("Arial", Font.BOLD, 18));
            totalOrdersLabel.setForeground(Color.BLACK);
            panel.add(totalOrdersLabel, BorderLayout.EAST);

            imageLabel = new JLabel("", JLabel.CENTER);
            panel.add(imageLabel, BorderLayout.CENTER);

            totalPriceLabel = new JLabel("총 결제 금액: 0원", JLabel.CENTER);
            totalPriceLabel.setFont(new Font("Arial", Font.PLAIN, 16));
            totalPriceLabel.setForeground(Color.BLACK);
            panel.add(totalPriceLabel, BorderLayout.SOUTH);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(1, 3));

            JButton croissantButton = new JButton("크루아상");
            croissantButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    croissantCount++;
                    updateOrderDetails();
                    updateImage(0);
                }
            });

            JButton baguetteButton = new JButton("바게트");
            baguetteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    baguetteCount++;
                    updateOrderDetails();
                    updateImage(1);
                }
            });

            JButton sandwichButton = new JButton("샌드위치");
            sandwichButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    sandwichCount++;
                    updateOrderDetails();
                    updateImage(2);
                }
            });

            buttonPanel.add(croissantButton);
            buttonPanel.add(baguetteButton);
            buttonPanel.add(sandwichButton);

            frame.add(panel, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.NORTH);

            frame.setVisible(true);
        }

        private static void updateOrderDetails() {
            int totalOrders = croissantCount + baguetteCount + sandwichCount;
            int totalPrice = totalOrders * ITEM_PRICE;
            totalOrdersLabel.setText("총 주문 개수: " + totalOrders);
            totalPriceLabel.setText("총 결제 금액: " + totalPrice + "원");
        }

        private static void updateImage(int index) {
            ImageIcon imageIcon = new ImageIcon(itemImages[index]);
            imageLabel.setIcon(imageIcon);
        }
    }
