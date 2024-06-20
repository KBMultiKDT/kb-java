package _0704_pattern_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q3_stream {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 4, 2};

        List<Integer> result = Arrays.stream(numbers)  // 배열을 스트림으로 변환
                .filter(n -> n % 2 == 0)                  // 짝수 필터링
                .map(n -> n * 2)                          // 각 요소에 2를 곱함
                .sorted()                                 // 정렬
                .boxed()                                  // int를 Integer로 박싱
                .collect(Collectors.toList());            // 리스트로 수집

        System.out.println(result);                   // 결과 출력
    }
}
