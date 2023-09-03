package homeWork_3.factory;

import homeWork_3.factory.model.Shape;

public class Main {
    public static void main(String[] args) {
        IShapeFactory factory = new CircleFactory(); //меняя фабрику мы будем менять и созание фигуры
        Shape shape = factory.createShape();
        shape.draw();

        factory = new SquareFactory();
        shape = factory.createShape();
        shape.draw();
    }
}
