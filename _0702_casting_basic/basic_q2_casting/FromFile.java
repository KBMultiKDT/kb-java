package _0702_casting_basic.basic_q2_casting;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FromFile {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("검색하기 원하는 회사명 입력");
        fileName += ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
