package src;

import java.util.Arrays;

public class Vetores {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = binarySearch(arr, 4);
//        int index = Arrays.binarySearch(arr, 4);
        System.out.println("index " + index);
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return - 1;
        }

        int start = 0;
        int end = arr.length - 1;
        int middle = start + (end - start) / 2;

        while (start <= end) {
            if (target == arr[middle]) {
                return middle;
            }
            if (target > arr[middle]) {
                start = middle + 1;
            }
            if (target < arr[middle]) {
                end = middle - 1;
            }
            middle = start + (end - start) / 2;
        }

        return -1;
    }
}
