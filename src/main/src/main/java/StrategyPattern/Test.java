package StrategyPattern;

import StrategyPattern.operator.OperationOne;
import StrategyPattern.operator.OperationThree;
import StrategyPattern.operator.OperationTwo;

/**
 * Created by AceCream on 2017/3/29.
 */
public class Test {
    public static void main(String[] args) {
        Context context;
        //第一个策略
        context = new Context(new OperationOne());
        System.out.println(context.executeStrategy("过河拆桥!"));
        //第二个策略
        context = new Context(new OperationTwo());
        System.out.println(context.executeStrategy("无懈可击!"));
        //第三个策略
        context = new Context(new OperationThree());
        System.out.println(context.executeStrategy("闪电!"));

    }
}
