package _0626_inherit_basic.basic_q4_inherit;

import javax.swing.*;

public class Racer extends Thread {
    private String name2;
    private int position;
    private int finishLine;
    private Race race;
    private JLabel label;

    public Racer(String name, int finishLine, Race race, JLabel label) {
        this.name2 = name;
        this.position = 0;
        this.finishLine = finishLine;
        this.race = race;
        this.label = label;
    }

    public String getName2() {
        return name2;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        int moveDistance = (int) (Math.random() * 20) + 1;
        position += moveDistance;
        label.setLocation(position, label.getY());
        System.out.println(name2 + " moves " + moveDistance + " steps. Total position: " + position);
    }

    @Override
    public void run() {
        while (position < finishLine && !race.isRaceFinished()) {
            move();
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (position >= finishLine) {
                race.finishRace(this);
            }
        }
    }
}