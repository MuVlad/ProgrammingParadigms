package homeWork_3.strategy;

public class SelectionSort implements SortStrategy{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;

                }
            }
            if (i != minPosition) {
                int temp = arr[i];
                arr[i] = arr[minPosition];
                arr[minPosition] = arr[temp];
            }
        }
    }
}
