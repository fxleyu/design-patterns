package fx.leyu.designpatterns.strategy.imooc;

import fx.leyu.designpatterns.strategy.imooc.impl.FlyWithWin;

public class RedheadDuck extends Duck {
    
    public RedheadDuck() {
        setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }

}
