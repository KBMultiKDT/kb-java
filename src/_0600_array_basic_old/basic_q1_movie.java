package _0600_array_basic_old;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q1_movie {

    private static JLabel titleLabel;
    private static JLabel imageLabel;
    private static JLabel priceLabel;
    private static int currentIndex = 0;

    private static String[] movieTitles = {
            "파묘", "소울메이트", "범죄도시3", "듄: 파트 2", "남은 인생 10년"
    };
    private static String[] movieImages = {
            "img/path_to_image1.png", "img/path_to_image2.png", "img/path_to_image3.png", "img/path_to_image4.png", "img/path_to_image5.png"
    };
    private static String[] moviePrices = {
            "10,000 캐시", "1,000 캐시", "2,750 캐시", "7,700 캐시", "2,750 캐시"
    };

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Naver SeriesOn Movie Rankings");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set colorful background
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(60, 179, 113)); // Light green color

        titleLabel = new JLabel(movieTitles[0], JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.WHITE);
        ImageIcon imageIcon = new ImageIcon(movieImages[0]);
        imageLabel = new JLabel("", JLabel.CENTER);
        imageLabel.setIcon(imageIcon);

        priceLabel = new JLabel(moviePrices[0] + "", JLabel.CENTER);
        priceLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        priceLabel.setForeground(Color.YELLOW);


        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(priceLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));

        JButton leftButton = new JButton("Previous");
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex = (currentIndex - 1 + movieTitles.length) % movieTitles.length;
                titleLabel.setText(movieTitles[currentIndex]);
                ImageIcon imageIcon = new ImageIcon(movieImages[currentIndex]);
                imageLabel.setIcon(imageIcon);
                priceLabel.setText(moviePrices[currentIndex]);
            }
        });

        JButton rightButton = new JButton("Next");
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex = (currentIndex + 1) % movieTitles.length;
                titleLabel.setText(movieTitles[currentIndex]);
                ImageIcon imageIcon = new ImageIcon(movieImages[currentIndex]);
                imageLabel.setIcon(imageIcon);
                priceLabel.setText(moviePrices[currentIndex]);
            }
        });

        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}