package _0708_lambda_basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q3_lambda {

    public static void main(String[] args) {
//1.  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sumOfOdds = numbers.stream()
//                               .filter(n -> n % 2 != 0)
//                               .reduce(0, Integer::sum);
//        System.out.println(sumOfOdds);

        //2.
//        List<Integer> numbers = Arrays.asList(5, 3, 10, 40, 2);
//        int maxNumber = numbers.stream()
//                        .max(Integer::compare).get();
//        System.out.println(maxNumber);

        //3.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> addedFive = list.stream()
                .map(n -> n + 5)
                .collect(Collectors.toList());
        System.out.println(addedFive);
    }
}
