package FactoryPattern;

/**
 * Created by AceCream on 2017/4/1.
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 */
public class ShapeDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.show();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.show();
        Shape square = shapeFactory.getShape("Square");
        square.show();
    }
}

