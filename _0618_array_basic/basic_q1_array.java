package _0618_array_basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class basic_q1_array {
        public static void main(String[] args) {
            // Step 1: Generate an array with random values between 1 and 100
            Random rand = new Random();
            int[] arr = new int[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100) + 1;
            }

            System.out.println("Original array: " + Arrays.toString(arr));

            // Step 2: Find the maximum value in the array
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum value: " + max);

            // Step 3: Find the index of the maximum value
            int maxIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    maxIndex = i;
                    break;
                }
            }
            System.out.println("Index of maximum value: " + maxIndex);

            // Step 4: Sort the array in ascending order
            Arrays.sort(arr);
            System.out.println("Array in ascending order: " + Arrays.toString(arr));

            // Step 5: Reverse the array to get descending order
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
            System.out.println("Array in descending order: " + Arrays.toString(arr));

            // Step 6: Remove duplicates and print the unique values and their count
            Set<Integer> uniqueValues = new HashSet<>();
            for (int num : arr) {
                uniqueValues.add(num);
            }

            System.out.println("Unique values: " + uniqueValues);
            System.out.println("Count of unique values: " + uniqueValues.size());
        }
    }
