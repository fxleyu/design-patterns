package fx.leyu.designpatterns.templatemethod.immoc;

/*
 * 具体实现类
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");

    }

    @Override
    protected void boilWater() {
        System.out.println("加入糖和牛奶");
    }

}
