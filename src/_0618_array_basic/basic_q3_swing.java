package _0618_array_basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class basic_q3_swing {
        private static JTextArea textArea;
        private static JButton generateButton;

        public static void main(String[] args) {
            JFrame frame = new JFrame();

            frame. setTitle("Array Swing Application");
            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);

            generateButton = new JButton("Generate and Process Arrays");
            generateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Random rand = new Random();

                    // Step 1: 두 개의 정수 배열 생성
                    int[] arr1 = new int[10];
                    int[] arr2 = new int[10];
                    for (int i = 0; i < 10; i++) {
                        arr1[i] = rand.nextInt(100) + 1;
                        arr2[i] = rand.nextInt(100) + 1;
                    }

                    textArea.setText("배열 1: " + Arrays.toString(arr1) + "\n");
                    textArea.append("배열 2: " + Arrays.toString(arr2) + "\n");

                    // Step 2: 두 배열을 하나로 합친 후, 중복 값 제거
                    Set<Integer> combinedSet = new HashSet<>();
                    for (int num : arr1) {
                        combinedSet.add(num);
                    }
                    for (int num : arr2) {
                        combinedSet.add(num);
                    }

                    Integer[] combinedArray = combinedSet.toArray(new Integer[0]);
                    textArea.append("중복 값 제거된 배열: " + Arrays.toString(combinedArray) + "\n");

                    // Step 3: 배열 오름차순 정렬
                    Arrays.sort(combinedArray);
                    textArea.append("오름차순 정렬된 배열: " + Arrays.toString(combinedArray) + "\n");

                    // Step 4: 최대값과 최소값 찾기
                    int maxValue = combinedArray[combinedArray.length - 1];
                    int minValue = combinedArray[0];
                    textArea.append("최대값: " + maxValue + "\n");
                    textArea.append("최소값: " + minValue + "\n");
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(scrollPane, BorderLayout.CENTER);
            panel.add(generateButton, BorderLayout.SOUTH);

            frame.add(panel);
            frame.setVisible(true);
        }
    }
