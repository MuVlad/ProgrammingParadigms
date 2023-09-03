package homeWork_4;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
        System.out.println(factorial(5));
    }

    private static int recursiveSum(int number) {

        return number == 1 ? 1 : number + recursiveSum(number - 1);
    }

    private static int factorial(int number) {
        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
