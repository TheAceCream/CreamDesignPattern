package StrategyPattern;

/**
 * Created by AceCream on 2017/3/29.
 */
public class Context {

    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String s){
        return strategy.operate(s);
    }

}
