package _0617_java_basic;

import javax.swing.JOptionPane;

public class basic_q3_oper {
    public static void main(String[] args) {
        // 두 번의 수학 점수 입력 받기
        String mathScore1 = JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요:");
        String mathScore2 = JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요:");

        // 두 번의 영어 점수 입력 받기
        String englishScore1 = JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요:");
        String englishScore2 = JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요:");

        // 입력받은 점수를 정수로 변환
        int math1 = Integer.parseInt(mathScore1);
        int math2 = Integer.parseInt(mathScore2);
        int english1 = Integer.parseInt(englishScore1);
        int english2 = Integer.parseInt(englishScore2);

        // 평균 계산
        double mathAverage = (math1 + math2) / 2.0;
        double englishAverage = (english1 + english2) / 2.0;

        // 결과를 JOptionPane으로 출력
        String message = String.format("수학 평균 점수: %.2f\n영어 평균 점수: %.2f", mathAverage, englishAverage);
        JOptionPane.showMessageDialog(null, message);
    }
}
