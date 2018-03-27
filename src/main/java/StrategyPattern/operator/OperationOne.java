package StrategyPattern.operator;

import StrategyPattern.Strategy;

/**
 * Created by AceCream on 2017/3/29.
 */
public class OperationOne implements Strategy {

    @Override
    public String operate(String s) {
        s = "第一个策略！......"+ s;
        return s;
    }

}
