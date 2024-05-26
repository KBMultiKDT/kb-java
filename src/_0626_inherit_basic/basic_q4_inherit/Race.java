package _0626_inherit_basic.basic_q4_inherit;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Racer> racers;
    private int finishLine;
    private boolean raceFinished;

    public Race(int numberOfRacers, int finishLine, JPanel panel) {
        racers = new ArrayList<>();
        this.finishLine = finishLine;
        this.raceFinished = false;

        for (int i = 1; i <= numberOfRacers; i++) {
            JLabel label = new JLabel();
            ImageIcon icon = new ImageIcon("image/" + i +  ".png");
            Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));
            label.setBounds((i * 120) - 100 + 30, (i * 120) - 100 + 30, 100, 100);
            panel.add(label);
            racers.add(new Racer("Racer " + i, finishLine, this, label));
        }
    }

    public synchronized boolean isRaceFinished() {
        return raceFinished;
    }

    public synchronized void finishRace(Racer winner) {
        if (!raceFinished) {
            raceFinished = true;
            System.out.println(winner.getName() + " wins the race!");
        }
    }

    public void startRace() {
        for (Racer racer : racers) {
            racer.start();
        }
    }
}