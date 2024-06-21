package _0708_lambda_deep;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class deep_q2_lambda {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig");
        Map<Character, Long> groupedByFirstChar = words.stream()
                .filter(w -> w.length() >= 5) // 길이가 5 이상인 것만 필터링
                .map(String::toLowerCase) // 소문자로 변환
                .collect(Collectors.groupingBy(w -> w.charAt(0), Collectors.counting())); // 첫 글자로 그룹화하고 카운트

        System.out.println(groupedByFirstChar);
    }
}
