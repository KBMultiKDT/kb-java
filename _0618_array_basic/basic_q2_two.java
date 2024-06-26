package _0618_array_basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class basic_q2_two {
    public static void main(String[] args) {
        // Step 1: 두 개의 정수 배열 생성
        Random rand = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = rand.nextInt(50) + 1;
            arr2[i] = rand.nextInt(50) + 51;
        }

        System.out.println("배열 1: " + Arrays.toString(arr1));
        System.out.println("배열 2: " + Arrays.toString(arr2));

        // Step 2: 두 배열을 하나로 합친 후, 중복 값 제거
        Set<Integer> combinedSet = new HashSet<>();
        for (int num : arr1) {
            combinedSet.add(num);
        }
        for (int num : arr2) {
            combinedSet.add(num);
        }

        Integer[] combinedArray = combinedSet.toArray(new Integer[0]);
        System.out.println("중복 값 제거된 배열: " + Arrays.toString(combinedArray));

        // Step 3: 배열 오름차순 정렬
        Arrays.sort(combinedArray);
        System.out.println("오름차순 정렬된 배열: " + Arrays.toString(combinedArray));

        // Step 4: 최대값과 최소값 찾기
        int maxValue = combinedArray[combinedArray.length - 1];
        int minValue = combinedArray[0];
        System.out.println("최대값: " + maxValue);
        System.out.println("최소값: " + minValue);

        // Step 5: 최대값과 최소값의 위치(인덱스) 출력
        int maxIndex = -1;
        int minIndex = -1;
        for (int i = 0; i < combinedArray.length; i++) {
            if (combinedArray[i] == maxValue) {
                maxIndex = i;
            }
            if (combinedArray[i] == minValue) {
                minIndex = i;
            }
        }
        System.out.println("최대값의 위치: " + maxIndex);
        System.out.println("최소값의 위치: " + minIndex);
    }
}

