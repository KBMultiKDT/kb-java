package _0703_pattern_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q2_stream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()  // 배열을 스트림으로 변환
                .filter(n -> n > 3)                  // 3보다 큰 요소만 필터링
                .collect(Collectors.toList());            // 리스트로 수집

        System.out.println(result);                   // 결과 출력

        ///////////
        List<Integer> result2 = numbers.stream()  // 배열을 스트림으로 변환
                .map(n -> n * 10) // 각 요소에 10씩 곱함.
                .collect(Collectors.toList());            // 리스트로 수집

        System.out.println(result2);                   // 결과 출력
    }
}
