package homeWork_5;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(searchPrimeNumber(6,20));
    }

    private static List<Integer> searchPrimeNumber(int start, int end) {
        List result = new ArrayList<Integer>();
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j * j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
