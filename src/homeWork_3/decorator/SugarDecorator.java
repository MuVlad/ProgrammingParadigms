package homeWork_3.decorator;

abstract class SugarDecorator extends Coffe {
    Coffe coffe;

    public SugarDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

    public abstract int cost();
}
