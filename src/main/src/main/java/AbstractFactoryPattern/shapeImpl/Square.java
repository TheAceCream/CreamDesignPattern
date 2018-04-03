package AbstractFactoryPattern.shapeImpl;


import AbstractFactoryPattern.Shape;

/**
 * Created by AceCream on 2017/4/1.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("我是方形");
    }
}
