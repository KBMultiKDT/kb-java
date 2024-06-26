package _0626_inherit_deep.deep_q1_inherit;

import javax.swing.*;
import java.awt.*;

import java.util.Random;

public class CirclePanel extends JPanel implements Runnable {
    private int x;
    private int y;
    private int radius;
    private int xDirection;
    private int yDirection;
    private Color color;
    private Random random;

    public CirclePanel(Color color) {
        this.x = 0;
        this.y = 0;
        this.radius = 50;
        this.xDirection = 5;  // 초기 방향 설정
        this.yDirection = 5;  // 초기 방향 설정
        this.color = color;
        this.random = new Random();
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }

    @Override
    public void run() {
        while (true) {
            // 좌우 이동
            x += xDirection;
            if (x <= 0 || x + radius >= getWidth()) {
                xDirection = -xDirection; // 방향 반전
                xDirection += random.nextInt(11) - 5; // -5에서 +5 사이의 무작위 값 추가
            }

            // 상하 이동
            y += yDirection;
            if (y <= 0 || y + radius >= getHeight()) {
                yDirection = -yDirection; // 방향 반전
                yDirection += random.nextInt(11) - 5; // -5에서 +5 사이의 무작위 값 추가
            }

            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}