package _0600_array_basic_old;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class basic_q4_array {
    private static final int TOTAL_SEATS = 200;
    private static final int SEAT_PRICE = 10000;
    private static ArrayList<Integer> reservedSeats = new ArrayList<>();
    private static JButton[] seatButtons = new JButton[TOTAL_SEATS];

    public static void main(String[] args) {
        JFrame frame = new JFrame("Seat Reservation System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        JPanel seatPanel = new JPanel();
        seatPanel.setLayout(new GridLayout(20, 10));

        for (int i = 0; i < TOTAL_SEATS; i++) {
            seatButtons[i] = new JButton(String.valueOf(i + 1));
            seatButtons[i].addActionListener(new SeatButtonListener(i + 1));
            seatPanel.add(seatButtons[i]);
        }

        JButton payButton = new JButton("결제하기");
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder seats = new StringBuilder("예약된 좌석 번호: ");
                for (int seat : reservedSeats) {
                    seats.append(seat).append(" ");
                }
                int totalAmount = reservedSeats.size() * SEAT_PRICE;
                JOptionPane.showMessageDialog(frame, seats.toString() + "\n총 결제 금액: " + totalAmount + "원");
            }
        });

        frame.add(seatPanel, BorderLayout.CENTER);
        frame.add(payButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private static class SeatButtonListener implements ActionListener {
        private int seatNumber;

        public SeatButtonListener(int seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (!reservedSeats.contains(seatNumber)) {
                reservedSeats.add(seatNumber);
                button.setBackground(Color.RED);
                button.setOpaque(true);
                button.setEnabled(false);
            }
        }
    }
}
