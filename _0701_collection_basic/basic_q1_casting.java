package _0701_casting_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class basic_q1_casting {
    public static void main(String[] args) {
//        // 참가자 목록 생성 및 초기화
//        ArrayList<String> participants = new ArrayList<>();
//        participants.add("박소정");
//        participants.add("김경민");
//        participants.add("소지현");
//        participants.add("김개빈");
//
//        // 참가자 목록 출력
//        System.out.println("초기 참가자 목록: " + participants);
//
//        // 2등 탈락 처리 (김경민 탈락)
//        if (participants.size() > 1) {
//            participants.remove(1);  // 인덱스 1인 김경민 제거
//        }
//
//        // 탈락 후 참가자 목록 출력
//        System.out.println("탈락 후 참가자 목록: " + participants);
//
//        // 최종 순위 출력
//        for (int i = 0; i < participants.size(); i++) {
//            System.out.println((i + 1) + "등: " + participants.get(i));
//        }


        // 시험 과목을 LinkedList로 관리
        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("국어");
        subjects.add("수학");
        subjects.add("영어");
        subjects.add("컴퓨터");

        // 초기 시험 과목 출력
        System.out.println("처음 시험별 과목: " + subjects);

        // 각 시험 회차 후 과목 제거 및 출력
        subjects.remove(); // 첫 번째 과목 국어 제거
        System.out.println("1회차 시험을 한 날은 과목: " + subjects);

        subjects.remove(); // 두 번째 과목 수학 제거
        System.out.println("2회차 시험을 한 날은 과목: " + subjects);

        subjects.remove(); // 세 번째 과목 영어 제거
        System.out.println("3회차 시험을 한 날은 과목: " + subjects);


    }
}