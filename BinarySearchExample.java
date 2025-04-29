
// 81.	Write a program to implement a binary search.

import java.util.Arrays;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int index = binarySearch(arr, 7);
        System.out.println("Found at index: " + index);
    }
}
