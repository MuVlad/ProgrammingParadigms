package homeWork_2;

/**
 * Описание: Написать функцию, которая возвращает n-ое число Фибоначчи.
 * Почему это процедурное программирование: Здесь мы можем использовать рекурсивную процедуру,
 * где каждый вызов функции делает два дополнительных вызова (для n-1 и n-2). Хотя это не самый эффективный способ решения,
 * он хорошо демонстрирует концепцию процедурного программирования.
 */
public class RecursiveTask {
    public static void main(String[] args) {
        System.out.println(fibonachi(7));
    }

    private static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}
