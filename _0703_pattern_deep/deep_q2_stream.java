package _0703_pattern_deep;

import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class deep_q2_stream {

    public static void main(String[] args) {
        Random random = new Random();

        // 500개의 랜덤 정수 생성 및 스트림 처리
        Map<Integer, Integer> groupedSums = IntStream.generate(() -> random.nextInt(401) - 200)
                .limit(500)
                .filter(n -> n >= 0 && n % 2 == 0)  // 0 이상의 짝수 필터
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> (int) Math.sqrt(n),  // 제곱근의 정수 부분으로 그룹화
                        Collectors.summingInt(n -> n)  // 그룹 내의 합 계산
                ));

        // 최대 그룹 합계와 해당 그룹의 키(제곱근의 정수 부분) 찾기
        if (!groupedSums.isEmpty()) {
            int maxKey = Collections.max(groupedSums.entrySet(), Map.Entry.comparingByValue()).getKey();
            int maxValue = groupedSums.get(maxKey);

            System.out.println("가장 큰 그룹의 제곱근: " + maxKey);
            System.out.println("해당 그룹의 합: " + maxValue);
        } else {
            System.out.println("적합한 데이터가 없습니다.");
        }
    }
    }

