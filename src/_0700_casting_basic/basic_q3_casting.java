package _0700_casting_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class basic_q3_casting extends JFrame{
    private JButton addRedLightButton;
    private JButton addYellowLightButton;
    private JButton addGreenLightButton;

    public basic_q3_casting() {
        setTitle("Traffic Light Adder");
        setSize(360, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize buttons
        addRedLightButton = new JButton("Add Red Light");
        addYellowLightButton = new JButton("Add Yellow Light");
        addGreenLightButton = new JButton("Add Green Light");

        addRedLightButton.setBackground(Color.red);
        addRedLightButton.setOpaque(true);

        addYellowLightButton.setBackground(Color.yellow);
        addYellowLightButton.setOpaque(true);

        addGreenLightButton.setBackground(Color.green);
        addGreenLightButton.setOpaque(true);

        addRedLightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLight("image/red.png");
            }
        });

        addYellowLightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLight("image/yellow.png");
            }
        });

        addGreenLightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLight("image/green.png");
            }
        });

        // Add buttons to JFrame
        add(addRedLightButton);
        add(addYellowLightButton);
        add(addGreenLightButton);
    }

    private void addLight(String imagePath) {
        // Create an ImageIcon and add it to a new JLabel
        ImageIcon icon = new ImageIcon(imagePath);
        JLabel label = new JLabel(icon);
        add(label);
        // Refresh the JFrame to display the new image
        validate();
    }

    public static void main(String[] args) {
                new basic_q3_casting().setVisible(true);
    }
}