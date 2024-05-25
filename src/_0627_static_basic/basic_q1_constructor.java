package _0627_static_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q1_constructor {
    private static int jjamppongCount = 0;
    private static int udonCount = 0;
    private static int jjajangmyeonCount = 0;
    private static final int PRICE_JJAMPPOONG = 5000;
    private static final int PRICE_UDON = 6000;
    private static final int PRICE_JJAJANGMYEON = 4500;

    private static JLabel lblImage;

    public static void main(String[] args) {
        JFrame frame = new JFrame("중국집 주문화면");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton btnJjamppong = new JButton("짬뽕");
        btnJjamppong.setBounds(50, 50, 150, 50);
        panel.add(btnJjamppong);

        JButton btnUdon = new JButton("우동");
        btnUdon.setBounds(250, 50, 150, 50);
        panel.add(btnUdon);

        JButton btnJjajangmyeon = new JButton("짜장면");
        btnJjajangmyeon.setBounds(450, 50, 150, 50);
        panel.add(btnJjajangmyeon);

        JLabel lblTotalCount = new JLabel("총 개수 : ");
        lblTotalCount.setBounds(50, 120, 100, 30);
        panel.add(lblTotalCount);

        JTextField txtTotalCount = new JTextField();
        txtTotalCount.setBounds(150, 120, 100, 30);
        txtTotalCount.setEditable(false);
        panel.add(txtTotalCount);

        lblImage = new JLabel();
        lblImage.setBounds(50, 200, 700, 300);
        lblImage.setHorizontalAlignment(JLabel.CENTER);
        lblImage.setIcon(new ImageIcon(new ImageIcon("image/image.png").getImage().getScaledInstance(700, 300, Image.SCALE_SMOOTH))); // 기본 이미지 설정
        panel.add(lblImage);

        JLabel lblTotalPrice = new JLabel("결제금액: ");
        lblTotalPrice.setBounds(50, 530, 100, 30);
        panel.add(lblTotalPrice);

        JTextField txtTotalPrice = new JTextField();
        txtTotalPrice.setBounds(150, 530, 100, 30);
        txtTotalPrice.setEditable(false);
        panel.add(txtTotalPrice);

        JLabel lblOrderSummary = new JLabel("짬뽕0개, 우동0개, 짜장면0개");
        lblOrderSummary.setBounds(270, 530, 300, 30);
        panel.add(lblOrderSummary);

        btnJjamppong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jjamppongCount++;
                updateOrder(txtTotalCount, txtTotalPrice, lblOrderSummary);
                setImage("image/image.png"); // 짬뽕 이미지 경로 설정
            }
        });

        btnUdon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                udonCount++;
                updateOrder(txtTotalCount, txtTotalPrice, lblOrderSummary);
                setImage("image/image2.png"); // 우동 이미지 경로 설정
            }
        });

        btnJjajangmyeon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jjajangmyeonCount++;
                updateOrder(txtTotalCount, txtTotalPrice, lblOrderSummary);
                setImage("image/image3.png"); // 짜장면 이미지 경로 설정
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void updateOrder(JTextField txtTotalCount, JTextField txtTotalPrice, JLabel lblOrderSummary) {
        int totalCount = jjamppongCount + udonCount + jjajangmyeonCount;
        int totalPrice = (jjamppongCount * PRICE_JJAMPPOONG) + (udonCount * PRICE_UDON) + (jjajangmyeonCount * PRICE_JJAJANGMYEON);

        txtTotalCount.setText(totalCount + "개");
        txtTotalPrice.setText(totalPrice + "원");
        lblOrderSummary.setText("짬뽕" + jjamppongCount + "개, 우동" + udonCount + "개, 짜장면" + jjajangmyeonCount + "개");
    }

    private static void setImage(String imagePath) {
        lblImage.setIcon(new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(700, 300, Image.SCALE_SMOOTH)));
    }
}
