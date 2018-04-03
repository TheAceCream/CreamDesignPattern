package FactoryPattern;

/**
 * Created by AceCream on 2017/4/1.
 */
public class ShapeFactory {

    public Shape getShape(String string){
        Shape shape = null;
        switch (string){
            case "Square":
                shape = new Square();
                break;
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
        }
        return shape;


    }

}
