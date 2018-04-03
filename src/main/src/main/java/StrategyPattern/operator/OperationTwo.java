package StrategyPattern.operator;

import StrategyPattern.Strategy;

public class OperationTwo implements Strategy {
    @Override
    public String operate(String s) {
        s = "第二个策略！......." + s;
        return s;
    }
}
