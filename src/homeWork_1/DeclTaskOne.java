package homeWork_1;

/*
 Вычисление факториала числа. Напишите программу,
  которая находит факториал заданного числа N с использованием рекурсии или встроенных функций.
 */
public class DeclTaskOne {
    public static void main(String[] args) {
        System.out.println(getFactotial(5));
    }

    private static int getFactotial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * getFactotial(num - 1);
        }
    }
}
