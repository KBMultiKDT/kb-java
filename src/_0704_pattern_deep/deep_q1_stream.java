package _0704_pattern_deep;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class deep_q1_stream {

    public static void main(String[] args) {
        Random random = new Random();

        // 100개의 랜덤 정수 생성 및 스트림 처리
        double average = IntStream.generate(() -> random.nextInt(201) - 100)  // -100부터 100 사이의 값
                .limit(100)  // 100개의 수
                .filter(n -> n > 0)  // 양수 필터
                .map(n -> n * n)  // 제곱 계산
                .filter(n -> n > 1000)  // 1000 초과 필터
                .average()  // 평균 계산
                .orElse(Double.NaN);  // 평균이 계산되지 않을 경우 NaN 반환

        System.out.println("평균: " + average);
    }
}
