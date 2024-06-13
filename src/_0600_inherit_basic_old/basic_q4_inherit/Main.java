package _0600_inherit_basic_old.basic_q4_inherit;

import javax.swing.*;
import java.awt.*;

public class Main {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Racing Game");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);
            frame.setLayout(null);

            JPanel panel = new JPanel();

            panel.setLayout(null);
            panel.setBounds(0, 0, 800, 800);
            panel.setBackground(Color.green);
            frame.add(panel);

            int numberOfRacers = 5;
            int finishLine = 800; // 결승선 위치

            Race race = new Race(numberOfRacers, finishLine, panel);
            frame.setVisible(true);

            race.startRace();
        }
    }