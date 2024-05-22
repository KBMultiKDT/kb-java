package _0618_array_deep;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Random;

public class deep_q1_array {
        public static void main(String[] args) {
                JFrame frame = new JFrame("Random Scores Table");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 400);

                // 과목명과 점수 배열 초기화
                String[] subjects = {"컴퓨터", "영어", "수학", "체육"};
                int[][] scores = new int[20][4]; // 각 과목별로 20개의 점수

                // 랜덤 점수 생성
                Random random = new Random();
                for (int i = 0; i < scores.length; i++) {
                    for (int j = 0; j < scores[i].length; j++) {
                        scores[i][j] = random.nextInt(101); // 0에서 100 사이의 랜덤 점수
                    }
                }

                // 테이블 컬럼명 설정
                String[] columnNames = new String[subjects.length + 1];
                columnNames[0] = "학생 번호";
                for (int i = 1; i <= subjects.length; i++) {
                    columnNames[i] = subjects[i - 1];
                }

                // 테이블 모델 구성
                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
                for (int i = 0; i < scores.length; i++) {
                    Object[] row = new Object[scores[i].length + 1];
                    row[0] = "학생 " + (i + 1);
                    for (int j = 0; j < scores[i].length; j++) {
                        row[j + 1] = scores[i][j];
                    }
                    tableModel.addRow(row);
                }

                // JTable 생성 및 설정
                JTable table = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(table);
                frame.add(scrollPane, BorderLayout.CENTER);

                // 프레임 표시
                frame.setVisible(true);
        }
    }

