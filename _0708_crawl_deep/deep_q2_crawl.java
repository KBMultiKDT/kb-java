package _0708_crawl_deep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class deep_q2_crawl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("검색하기 원하는 회사명 입력: ");
        String fileName = sc.next();
        fileName += ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
        sc.close();
    }
}
