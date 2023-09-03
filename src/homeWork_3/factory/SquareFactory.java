package homeWork_3.factory;

import homeWork_3.factory.model.Shape;
import homeWork_3.factory.model.Square;

public class SquareFactory implements IShapeFactory{

    @Override
    public Shape createShape() {
        return new Square();
    }
}
