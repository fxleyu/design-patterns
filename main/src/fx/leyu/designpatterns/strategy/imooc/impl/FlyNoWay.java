package fx.leyu.designpatterns.strategy.imooc.impl;

import fx.leyu.designpatterns.strategy.imooc.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

    @Override
    public void performFly() {
        System.out.println("我不会飞行！");
    }

}
