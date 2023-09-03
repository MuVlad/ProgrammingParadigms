package homeWork_3.factory;

import homeWork_3.factory.model.Circle;
import homeWork_3.factory.model.Shape;

public class CircleFactory implements IShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
