package homeWork_3.decorator;

public class Main {
    public static void main(String[] args) {
        Coffe coffe = new Milk(new Sugar(new Coffe()));
        System.out.println(coffe.cost());
    }
}
