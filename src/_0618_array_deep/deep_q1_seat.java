package _0618_array_deep;

import java.util.Scanner;

public class deep_q1_seat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] seats = new int[10][3]; // 10개의 행과 3개의 열
            int totalBooked = 0;
            int pricePerSeat = 10000;

            while (true) {
                System.out.println("현재 좌석 상태:");
                for (int i = 0; i < seats.length; i++) {
                    System.out.print((i + 1) + ": ");
                    for (int j = 0; j < seats[i].length; j++) {
                        System.out.print((char) ('A' + j) + ":" + seats[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();

                System.out.print("예매할 좌석 번호를 입력하세요 (종료하려면 0 입력): ");
                int seatNumber = scanner.nextInt();

                if (seatNumber == 0) {
                    break;
                } else if (seatNumber < 1 || seatNumber > 10) {
                    System.out.println("유효하지 않은 좌석 번호입니다. 1에서 10 사이의 번호를 입력하세요.");
                    continue;
                }

                System.out.print("예매할 열을 선택하세요 (A, B, C 중 하나 입력): ");
                char seatColumn = scanner.next().toUpperCase().charAt(0);
                int columnIndex = seatColumn - 'A';

                if (columnIndex < 0 || columnIndex >= 3) {
                    System.out.println("유효하지 않은 열입니다. A, B, C 중 하나를 입력하세요.");
                    continue;
                }

                if (seats[seatNumber - 1][columnIndex] == 1) {
                    System.out.println("이미 예매된 좌석입니다. 다른 좌석을 선택하세요.");
                } else {
                    seats[seatNumber - 1][columnIndex] = 1;
                    totalBooked++;
                    System.out.println(seatNumber + "" + seatColumn + " 좌석이 예매되었습니다.");
                }
            }

            int totalAmount = totalBooked * pricePerSeat;
            System.out.println("예매된 좌석 수: " + totalBooked);
            System.out.println("총 예매 금액: " + totalAmount + "원");

            scanner.close();
        }
    }

