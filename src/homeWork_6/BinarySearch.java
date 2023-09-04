package homeWork_6;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23, 15, 6, 44, 9, 74, 11, 2, 22};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 6));
    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < array[middle]) {
                high = middle - 1;
            } else if (key > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
