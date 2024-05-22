package _0618_array_deep;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class deep_q2_array {
    private static final int TOTAL_SEATS = 500;
    private static final int SEAT_PRICE = 5000;
    private static final int RANDOM_SEATS = 10;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Seat Reservation System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 800);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(25, 20)); // 25 rows and 20 columns for 500 seats

            JButton[] seats = new JButton[TOTAL_SEATS];
            Set<Integer> selectedSeats = new HashSet<>();
            Random random = new Random();

            while (selectedSeats.size() < RANDOM_SEATS) {
                selectedSeats.add(random.nextInt(TOTAL_SEATS));
            }

            for (int i = 0; i < TOTAL_SEATS; i++) {
                seats[i] = new JButton(String.valueOf(i + 1));
                if (selectedSeats.contains(i)) {
                    seats[i].setBackground(Color.ORANGE);
                } else {
                    seats[i].setBackground(Color.LIGHT_GRAY);
                }
                seats[i].setOpaque(true);
                seats[i].setBorderPainted(false);
                panel.add(seats[i]);
            }

            int totalPrice = SEAT_PRICE * RANDOM_SEATS;
            JLabel totalPriceLabel = new JLabel("총 결제 금액: " + totalPrice + "원");
            totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 16));
            totalPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);

            frame.add(panel, BorderLayout.CENTER);
            frame.add(totalPriceLabel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
