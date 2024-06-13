package _0600_inherit_basic.basic_q2_inherit._0627_inherit_basic.basic_q1_inherit;

import javax.swing.*;
import java.awt.*;

public class MovingTextPanel extends JPanel implements Runnable {
    private int x;
    private int y;
    private String text;
    private Color color;

    public MovingTextPanel(String text, Color color) {
        this.x = 0;
        this.y = 200;
        this.text = text;
        this.color = color;
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.drawString(text, x, y);
    }

    @Override
    public void run() {
        while (x < getWidth()) {
            x += 5;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}