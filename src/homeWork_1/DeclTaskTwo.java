package homeWork_1;

import java.util.List;

/*
 Поиск уникальных элементов в списке. Напишите программу,
  которая создает новый список, содержащий только уникальные элементы из исходного списка
 */
public class DeclTaskTwo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 8, 1, 3, 9, 4, 3, 5, 7, 9, 2);
        System.out.println(searchUniqueElements(integers));
    }

    private static List<Integer> searchUniqueElements(List<Integer> numbs) {
        return numbs.stream().distinct().toList();
    }

}
