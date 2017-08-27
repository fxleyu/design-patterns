package fx.leyu.designpatterns.strategy.imooc.impl;

import fx.leyu.designpatterns.strategy.imooc.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }

}
