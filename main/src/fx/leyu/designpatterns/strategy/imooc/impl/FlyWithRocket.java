package fx.leyu.designpatterns.strategy.imooc.impl;

import fx.leyu.designpatterns.strategy.imooc.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

    @Override
    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }

}
