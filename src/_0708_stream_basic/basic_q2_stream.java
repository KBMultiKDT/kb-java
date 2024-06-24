package _0708_stream_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q2_stream {

    public static void main(String[] args) {
        //1.
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 홀수만 필터링하여 합을 구한 후, 출력하시오.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);
        System.out.println(sumOfOdds);

        //2.
        // List<Integer> numbers = Arrays.asList(5, 3, 10, 40, 2); 가장 큰 값을 구한 후, 출력하시오.
        List<Integer> numbers2 = Arrays.asList(5, 3, 10, 40, 2);
        int max = numbers2.stream()
                .max(Integer::compare)
                .orElse(Integer.MIN_VALUE);
        System.out.println(max);

        //3.
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 모든 요소에 5를 더한 후, 새로운 리스트로 반환 후 출력하시오.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> addedList = list.stream()
                .map(n -> n + 5)
                .collect(Collectors.toList());
        System.out.println(addedList);
    }
}
