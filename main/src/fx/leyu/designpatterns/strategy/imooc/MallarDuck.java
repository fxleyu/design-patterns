package fx.leyu.designpatterns.strategy.imooc;

import fx.leyu.designpatterns.strategy.imooc.impl.FlyWithWin;

public class MallarDuck extends Duck {
    
    public MallarDuck() {
        super();
        setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }

}
