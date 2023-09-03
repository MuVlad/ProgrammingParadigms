package homeWork_4;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(fibonachi(5));
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
