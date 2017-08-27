package fx.leyu.designpatterns.strategy.imooc;

import fx.leyu.designpatterns.strategy.imooc.impl.FlyNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }
    
    @Override
    public void quack() {
        System.out.println("嘎~嘎~嘎~");
    }

}
