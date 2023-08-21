package homeWork_1;

/**
 * Подсчет суммы четных чисел от 1 до N. Напишите программу,
 * используя цикл, которая находит сумму всех четных чисел в диапазоне от 1 до заданного числа N.
 */
public class ImperTaskOne {
    public static void main(String[] args) {

        System.out.println(evenSum(11));
    }

    private static int evenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
