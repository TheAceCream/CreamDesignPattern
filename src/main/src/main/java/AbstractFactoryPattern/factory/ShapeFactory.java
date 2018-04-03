package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.Color;
import AbstractFactoryPattern.Shape;
import AbstractFactoryPattern.shapeImpl.Circle;
import AbstractFactoryPattern.shapeImpl.Rectangle;
import AbstractFactoryPattern.shapeImpl.Square;

/**
 * Created by AceCream on 2017/4/1.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equals("CIRCLE")){
            return new Circle();
        } else if(shape.equals("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
