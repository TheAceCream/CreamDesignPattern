package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.Color;
import AbstractFactoryPattern.Shape;
import AbstractFactoryPattern.colorImpl.Blue;
import AbstractFactoryPattern.colorImpl.Green;
import AbstractFactoryPattern.colorImpl.Red;

/**
 * Created by AceCream on 2017/4/1.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color=="RED"){
            return new Red();
        }else if (color=="BLUE"){
            return new Blue();
        }else if (color=="GREEN"){
            return new Green();
        }else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
