package _0619_array_basic;

import java.util.Random;

public class basic_q3_test {
    public static void main(String[] args) {
        int numberOfQuestions = 1000;
        int[] correctAnswers = new int[numberOfQuestions];
        int[] myAnswers = new int[numberOfQuestions];
        Random random = new Random();

        // 랜덤하게 1에서 4까지의 수능 답안과 내 답안을 생성
        for (int i = 0; i < numberOfQuestions; i++) {
            correctAnswers[i] = random.nextInt(4) + 1;
            myAnswers[i] = random.nextInt(4) + 1;
        }

        // 맞춘 개수를 세기
        int score = 0;
        System.out.printf("%-10s %-15s %-10s%n", "Index", "Correct Answer", "My Answer");
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.printf("%-10d %-15d %-10d%n", i, correctAnswers[i], myAnswers[i]);
            if (correctAnswers[i] == myAnswers[i]) {
                score++;
            }
        }

        // 결과 출력
        System.out.println("맞춘 개수: " + score);
    }
}