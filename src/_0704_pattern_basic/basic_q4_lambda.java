package _0704_pattern_basic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class basic_q4_lambda {
    public static void main(String[] args) {
        // 1부터 100까지의 랜덤한 값을 배열에 채우기
        Random random = new Random();
        int[] array = random.ints(100, 1, 101).toArray();


        // 문제 1: 배열에서 50보다 큰 수들만 추출하여 그 수들의 합계 계산 및 출력
        int sum = Arrays.stream(array)
                .filter(n -> n > 50)
                .sum();
        System.out.println("50보다 큰 수들의 합계: " + sum);

        // 문제 2: 배열의 각 요소에 대해 10을 곱한 결과를 새 배열로 만들고, 그 배열을 출력
        int[] multipliedArray = Arrays.stream(array)
                .map(n -> n * 10)
                .toArray();
        System.out.println("모든 요소에 10을 곱한 배열: " + Arrays.toString(multipliedArray));

    }

}