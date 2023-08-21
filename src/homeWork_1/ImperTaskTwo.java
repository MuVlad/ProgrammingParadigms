package homeWork_1;

import java.util.List;

/**
 * Поиск наименьшего числа в списке. Напишите программу,
 * которая находит наименьшее число в заданном списке с помощью цикла.
 */
public class ImperTaskTwo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(23, 43, 32, 65, 47, 87, 43, 20, 17, 19);
        System.out.println(smallestNumber(integers));
    }

    private static int smallestNumber(List<Integer> numbers) {
        Integer minNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (minNumber > number) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}
