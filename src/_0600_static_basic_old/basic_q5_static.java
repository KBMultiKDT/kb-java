package _0600_static_basic_old;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q5_static {

    private static int totalAge = 0;

    public static void main(String[] args) {
        UserInfoGUI.showGUI();
    }

    public static void addAge(int age) {
        totalAge += age;
    }

    public static int getTotalAge() {
        return totalAge;
    }
}

class UserInfoGUI {
    public static void showGUI() {
        JFrame frame = new JFrame("User Info");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2));
        frame.getContentPane().setBackground(Color.green);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Serif", Font.BOLD, 20));
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(nameField);
        nameField.setBackground(Color.yellow);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Serif", Font.BOLD, 20));
        frame.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(ageField);
        ageField.setBackground(Color.yellow);

        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Serif", Font.BOLD, 20));
        submitButton.setBackground(Color.GREEN);
        submitButton.setForeground(Color.BLACK);
        frame.add(submitButton);
        submitButton.setBackground(Color.orange);

        JLabel resultLabel = new JLabel("Total Age: 0", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Serif", Font.BOLD, 20));
        frame.add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                basic_q5_static.addAge(age);
                resultLabel.setText(name + " is " + age + " 세. \nTotal Age: " + basic_q5_static.getTotalAge());
                nameField.setText("");
                ageField.setText("");
            }
        });

        frame.setVisible(true);
    }
}

