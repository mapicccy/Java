package designPattern.strategyPattern;

/**
 * Created by zhaoguanjun on 2016/8/30.
 */
public class StrategyA implements Strategy{
    @Override
    public void commonStrategy() {
        System.out.println("Strategy A");
    }
}
