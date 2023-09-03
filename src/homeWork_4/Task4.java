package homeWork_4;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List strings = List.of("sky", "river", "mountains", "sea");
        System.out.println(reducera(strings));
    }

    private static String reducera(List<String> strings) {
       return strings.stream().collect(Collectors.joining(", "));
    }
}
