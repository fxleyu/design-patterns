package fx.leyu.designpatterns.strategy.imooc;

public abstract class Duck {
    
    private FlyingStragety flyingStragety;
    
    public Duck() {
        System.out.println("DUCK");
    }
    
    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }
    
    public void fly() {
        flyingStragety.performFly();
    }
    
    public void quack() {
        System.out.println("嘎嘎嘎");
    }
    
    public abstract void display();
    
}
