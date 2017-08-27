package fx.leyu.designpatterns.strategy.imooc;

import fx.leyu.designpatterns.strategy.imooc.impl.FlyNoWay;

public class BigYellow extends Duck {

    public BigYellow() {
        setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }
    
    

}
