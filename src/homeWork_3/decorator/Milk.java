package homeWork_3.decorator;

public class Milk extends MilkDecorator{
    public Milk(Coffe coffe) {
        super(coffe);
    }

    @Override
    public int cost() {
        return coffe.cost() + 30;
    }
}
