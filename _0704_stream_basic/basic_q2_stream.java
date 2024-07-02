package _0704_stream_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q2_stream {

    public static void main(String[] args) {
        //1.
        // int[] arr = {1, 2, 3, 4, 5}; 홀수만 필터링하여 합을 구한 후, 출력하시오.
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr)    // 배열을 스트림으로 변환
                .filter(n -> n % 2 != 0) // 홀수만 필터링
                .sum();         // 필터링된 요소들의 합을 계산

        System.out.println("홀수의 합: " + sum);

        //2.
        // int[] arr = {5, 3, 10, 40, 2}; 가장 큰 값을 구한 후, 출력하시오.
        int[] arr2 = {5, 3, 10, 40, 2};

        int max = Arrays.stream(arr2) // 배열을 스트림으로 변환
                .max() // 최대값을 찾음
                .getAsInt(); // int로 변환

        System.out.println("가장 큰 값: " + max);

        //3.
        // int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10}; 5보다 큰 수들을 필터링하여 중복을 제거한 후, 출력하시오.
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};

        Arrays.stream(arr3)    // 배열을 스트림으로 변환
            .filter(n -> n > 5) // 5보다 큰 수들을 필터링
            .distinct()       // 중복을 제거
            .forEach(System.out::println); // 결과를 출력
    }
}