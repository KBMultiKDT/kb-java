package _0703_pattern_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q3_lambda {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");

        List<String> result = words.stream()  // 배열을 스트림으로 변환
                .map(String::toUpperCase)
                .filter(x -> x.length() > 4)// 길이가 4보다 큰 요소만 필터링
                .collect(Collectors.toList());            // 리스트로 수집

        System.out.println(result);                   // 결과 출력

        ///////////

        List<String> result2 = words.stream()  // 배열을 스트림으로 변환
                .map(x -> x + "님")
                .collect(Collectors.toList());            // 리스트로 수집

        System.out.println(result2);
        // 결과 출력
    }
}
