package fx.leyu.designpatterns.templatemethod.immoc;

/*
 * 抽象基类，为所有子类提供一个算法框架 
 * 
 * 提神饮料
 */
public abstract class RefreshBeverage {

    /*
     * 制备饮料模板
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplete() {
        // 将水煮沸
        boilWater();
        // 泡制饮料
        brew();
        // 将饮料倒入杯中
        pourInCup();
        // 加入调味料
        addCondiments();
    }

    private void addCondiments() {
        System.out.println("将水煮沸");
    }

    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    protected abstract void brew();

    protected abstract void boilWater();
}
