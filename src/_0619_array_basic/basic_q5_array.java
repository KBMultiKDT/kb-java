package _0619_array_basic;

import java.util.Arrays;

public class basic_q5_array {
        public static void main(String[] args) {
            String[] subjects = {"국어", "영어", "수학", "컴퓨터", "회화"};
            int[] firstSemesterGrades = {44, 66, 22, 99, 100};
            int[] secondSemesterGrades = Arrays.copyOf(firstSemesterGrades, firstSemesterGrades.length);

            // 1학기 성적 수정
            secondSemesterGrades[0] = 22;  // 첫 번째 과목 성적 수정
            secondSemesterGrades[2] = 88;  // 세 번째 과목 성적 수정

            // 1. 전체 1학기, 2학기 성적 프린트
            System.out.println("1학기 성적: " + Arrays.toString(firstSemesterGrades));
            System.out.println("2학기 성적: " + Arrays.toString(secondSemesterGrades));

            // 2. 1학기, 2학기 성적 중 동일한 성적 과목수
            int sameGradesCount = 0;
            for (int i = 0; i < firstSemesterGrades.length; i++) {
                if (firstSemesterGrades[i] == secondSemesterGrades[i]) {
                    sameGradesCount++;
                }
            }
            System.out.println("1학기와 2학기 성적이 동일한 과목 수: " + sameGradesCount);

            // 3. 1학기, 2학기 성적 중 오른 과목수, 과목명
            int improvedSubjectsCount = 0;
            StringBuilder improvedSubjects = new StringBuilder();
            for (int i = 0; i < firstSemesterGrades.length; i++) {
                if (secondSemesterGrades[i] > firstSemesterGrades[i]) {
                    improvedSubjectsCount++;
                    improvedSubjects.append(subjects[i]).append(" ");
                }
            }
            System.out.println("1학기보다 성적이 오른 과목 수: " + improvedSubjectsCount);
            System.out.println("성적이 오른 과목명: " + improvedSubjects.toString().trim());
        }
    }
