package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.AbstractFactory;
import AbstractFactoryPattern.factory.ColorFactory;
import AbstractFactoryPattern.factory.ShapeFactory;

/**
 * Created by AceCream on 2017/4/1.
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choose){
        if (choose.equals("SHAPE")){
            return new ShapeFactory();
        }else if (choose.equals("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
