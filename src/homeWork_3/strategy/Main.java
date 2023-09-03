package homeWork_3.strategy;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{
                5, 2, 8, 1, 2, 9, 5, 2, 0, 10
        };

        SomeProgram someProgram = new SomeProgram();
        someProgram.setSortStrategy(new BubbleSort());

        long start = System.nanoTime();
        someProgram.executeSorting(array);
        long end = System.nanoTime();
        System.out.println("bubble sort: " + (end - start));

        someProgram.setSortStrategy(new SelectionSort());

        start = System.nanoTime();
        someProgram.executeSorting(array);
        end = System.nanoTime();
        System.out.println("selection sort: " + (end - start));
    }
}
