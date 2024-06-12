package _0619_array_basic;

import java.util.Scanner;

public class basic_q1_movie {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] movies = {"Quiet Place", "Avengers: Endgame", "Inception", "Parasite", "Interstellar"};
            int[] prices = {15000, 23000, 18000, 21000, 19000};

            // 영화 목록 출력
            System.out.println("네이버 시리즈온 실시간 영화 목록:");
            for (int i = 0; i < movies.length; i++) {
                System.out.printf("%d. %s - 조희수: %,d원\n", i + 1, movies[i], prices[i]);
            }

            // 사용자에게 영화 선택 요청
            System.out.println("\n정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5):");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > movies.length) {
                System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
            } else {
                // 선택한 영화 정보 출력
                System.out.printf("선택한 영화: %s\n조희수: %,d원\n", movies[choice - 1], prices[choice - 1]);
            }

            scanner.close();
        }
    }
