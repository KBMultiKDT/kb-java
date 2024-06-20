package _0600_inherit_basic;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGraphic extends JFrame {
    JLabel count, image, day;
    CountThread countThread;
    DayThread dayThread;
    ImageThread imageThread;

    public ThreadGraphic() {
        getContentPane().setBackground(Color.green);
        setSize(1000, 800);

        count = new JLabel();
        image = new JLabel();
        day = new JLabel();

        getContentPane().add(count, BorderLayout.WEST);
        getContentPane().add(image, BorderLayout.EAST);
        getContentPane().add(day, BorderLayout.SOUTH);

        Font font = new Font("나눔고딕", Font.BOLD, 50);
        count.setFont(font);
        day.setFont(font);

        countThread = new CountThread();
        countThread.start();

        dayThread = new DayThread();
        dayThread.start();

        imageThread = new ImageThread();
        imageThread.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new ThreadGraphic();
    }

    class CountThread extends Thread {
        @Override
        public void run() {
            for (int i = 5000; i >= 0; i--) {
                count.setText("Count: " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(count, "카운트가 종료되었습니다.");
            imageThread.stop();
            dayThread.stop();
        }
    }

    class DayThread extends Thread {
        @Override
        public void run() {
            while (true) {
                Date date = new Date();
                day.setText(date.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ImageThread extends Thread {
        String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        @Override
        public void run() {
            for (int i = 0; i < list.length; i++) {
                ImageIcon icon = new ImageIcon("image/" + list[i]);
                image.setIcon(icon);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


