package fx.leyu.designpatterns.strategy.imooc;

import fx.leyu.designpatterns.strategy.imooc.impl.FlyWithRocket;

public class SpaceDuck extends Duck {

    public SpaceDuck() {
        setFlyingStragety(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }
    
    @Override
    public void quack() {
        System.out.println("我通过无线电与你通信");
    }

}
