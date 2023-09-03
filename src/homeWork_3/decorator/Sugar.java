package homeWork_3.decorator;

public class Sugar extends SugarDecorator{
    public Sugar(Coffe coffe) {
        super(coffe);
    }

    @Override
    public int cost() {
        return coffe.cost() + 10;
    }
}
