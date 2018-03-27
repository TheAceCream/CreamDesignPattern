package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.AbstractFactory;

/**
 * Created by AceCream on 2017/4/1.
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("BLUE");

        circle.draw();
        red.fill();

    }
}
