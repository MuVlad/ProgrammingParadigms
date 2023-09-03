package homeWork_4;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(reductor(3, numbers));

    }

    private static int reductor(int num, List<Integer> numbers) {
        return numbers.stream().skip(num).mapToInt(Integer::intValue).sum();
    }
}
