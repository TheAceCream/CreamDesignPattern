package StrategyPattern.operator;

import StrategyPattern.Strategy;

public class OperationThree implements Strategy {

    @Override
    public String operate(String s) {
        s = "第三个策略！......" + s ;
        return s;
    }
}
