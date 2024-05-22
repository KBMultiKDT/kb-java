package _0619_class_basic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.*;

public class basic_q1_class {
        private static final String ROOT_ID = "root";
        private static final String ROOT_PW = "1234";

        public static void main(String[] args) {
                JFrame loginFrame = new JFrame("로그인");
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loginFrame.setSize(300, 200);
                loginFrame.setLayout(new FlowLayout());

                JTextField idField = new JTextField(20);
                JPasswordField pwField = new JPasswordField(20);
                JButton loginButton = new JButton("로그인");
                JButton resetButton = new JButton("Reset");

                loginButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String id = idField.getText();
                        String pw = new String(pwField.getPassword());
                        if (ROOT_ID.equals(id) && ROOT_PW.equals(pw)) {
                            loginFrame.dispose(); // Close login frame
                            openDiaryFrame();
                        } else {
                            JOptionPane.showMessageDialog(null, "로그인 실패. ID와 PW를 다시 확인해주세요.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                resetButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        idField.setText("");
                        pwField.setText("");
                    }
                });

                loginFrame.add(new JLabel("ID: "));
                loginFrame.add(idField);
                loginFrame.add(new JLabel("PW: "));
                loginFrame.add(pwField);
                loginFrame.add(loginButton);
                loginFrame.add(resetButton);

                loginFrame.setVisible(true);
        }

        private static void openDiaryFrame() {
            JFrame diaryFrame = new JFrame("일기 작성");
            diaryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            diaryFrame.setSize(600, 400);
            diaryFrame.setLayout(new BorderLayout());

            JPanel contentPanel = new JPanel();
            contentPanel.setLayout(new GridLayout(3, 2));

            JTextField titleField = new JTextField();
            JTextArea contentArea = new JTextArea();
            JButton saveButton = new JButton("일기 저장");

            contentPanel.add(new JLabel("날짜: " + getCurrentDate()));
            contentPanel.add(new JLabel(""));
            contentPanel.add(new JLabel("제목: "));
            contentPanel.add(titleField);
            contentPanel.add(new JLabel("내용: "));
            contentPanel.add(new JScrollPane(contentArea));

            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String title = titleField.getText();
                    String content = contentArea.getText();
                    saveDiary(title, content);
                }
            });

            diaryFrame.add(contentPanel, BorderLayout.CENTER);
            diaryFrame.add(saveButton, BorderLayout.SOUTH);

            diaryFrame.setVisible(true);
        }

        private static String getCurrentDate() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(new Date());
        }

        private static void saveDiary(String title, String content) {
            String currentDate = getCurrentDate();
            String fileName = currentDate + ".txt";
            try {
                FileWriter writer = new FileWriter(fileName);
                writer.write("날짜: " + currentDate + "\n");
                writer.write("제목: " + title + "\n");
                writer.write("내용:\n" + content);
                writer.close();
                JOptionPane.showMessageDialog(null, "일기가 저장되었습니다.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "일기 저장에 실패했습니다.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

