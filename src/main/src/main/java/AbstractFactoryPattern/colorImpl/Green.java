package AbstractFactoryPattern.colorImpl;

import AbstractFactoryPattern.Color;

/**
 * Created by AceCream on 2017/4/1.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
