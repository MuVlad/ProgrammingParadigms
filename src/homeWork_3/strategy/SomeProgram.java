package homeWork_3.strategy;

public class SomeProgram {
    SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void executeSorting(int[] arr) {
        sortStrategy.sort(arr);
    }
}
