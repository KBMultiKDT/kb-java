package _0708_lambda_deep;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class deep_q1_lambda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        List<Double> result = numbers.stream()
                .map(n -> n * 3) // 각 숫자에 3을 곱한다.
                .filter(n -> n % 2 == 0) // 짝수만 필터링한다.
                .map(Math::sqrt) // 제곱근을 계산한다.
                .sorted((a, b) -> Double.compare(b, a)) // 내림차순 정렬한다.
                .limit(5) // 최대 5개의 요소만 포함한다.
                .collect(Collectors.toList()); // 리스트로 수집한다.

        System.out.println(result);
    }
}
