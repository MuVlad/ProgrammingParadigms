package homeWork_2;

import java.util.*;

/**
 * Разбиение массива на подмассивы:
 * __
 * Описание: Имеется массив чисел. Необходимо разбить его на подмассивы так, чтобы сумма чисел в каждом подмассиве была меньше или равна заданному значению X.
 * Почему это процедурное программирование: Можно создать процедуру, которая будет принимать массив и значение X, а затем последовательно формировать подмассивы,
 * следуя определенной логике. Это позволяет выделить процесс создания каждого подмассива в отдельную подпрограмму, делая основной код более чистым и понятным.
 */
public class ProceduralTask {
    public static void main(String[] args) {
        int[] ar = {2, 4, 3, 1, 1, 4, 4, 5, 5, 2, 1,1};
        int x = 8;
        System.out.println(partitioningArray(ar,x));
    }

    private static Collection<List<Integer>> partitioningArray(int[] arr, int x) {
        Map<Integer, List<Integer>> integerListHashMap = new HashMap<>();
        int endIndex = 0;
        int startIndex = 0;
        int arraySum = 0;
        int numberArray = 0;

        for (int k : arr) {
            if (arraySum + k > x) {
                createSubArrayAndPushToMap(arr, startIndex, endIndex, integerListHashMap, numberArray);
                numberArray++;
                arraySum = 0;
                startIndex = endIndex;
            }
            arraySum += k;
            endIndex++;
        }
        createSubArrayAndPushToMap(arr, startIndex, endIndex, integerListHashMap, numberArray);

        return integerListHashMap.values();
    }

    private static void createSubArrayAndPushToMap(int[] arr, int startIndex, int endIndex, Map<Integer, List<Integer>> integerListHashMap, int numberArray) {
        List<Integer> subArr = new ArrayList<>();
        for (int j = startIndex; j < endIndex; j++) {
            subArr.add(arr[j]);
        }
        integerListHashMap.put(numberArray, subArr);
    }
}
