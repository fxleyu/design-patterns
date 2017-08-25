package fx.leyu.designpatterns.templatemethod.immoc;

public class Tea extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("用80度热水浸泡五分钟");

    }

    @Override
    protected void boilWater() {
        System.out.println("加入柠檬");
    }

}
