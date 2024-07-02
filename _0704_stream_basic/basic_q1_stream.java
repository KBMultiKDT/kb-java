package _0704_stream_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q1_stream {

    public static void main(String[] args) {
        //1.
        List<String> fruits = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");

        // 스트림을 사용하여 중복 제거 후 출력
        fruits.stream()
                .distinct()
                .forEach(System.out::println);  // 결과를 출력

        //2.
        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(filteredStrings);

    }
}
