package homeWork_3.decorator;

abstract class MilkDecorator extends SugarDecorator {
    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    public abstract int cost();
}
