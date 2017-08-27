package fx.leyu.designpatterns.strategy.imooc;

import org.junit.Test;

public class DuckTest {

    @Test
    public void testRedheadDuck() {
        System.out.println("测试鸭子程序");
        
        Duck duck = new RedheadDuck();
        duck.display();
        duck.fly();
        duck.quack();
        
        System.out.println("测试完毕");
    }
    
    @Test
    public void testMallarDuck() {
        System.out.println("测试鸭子程序");
        
        Duck duck = new MallarDuck();
        duck.display();
        duck.fly();
        duck.quack();
        
        System.out.println("测试完毕");
    }
    
    @Test
    public void testRubberDuck() {
        System.out.println("测试鸭子程序");
        
        Duck duck = new RubberDuck();
        duck.display();
        duck.fly();
        duck.quack();
        
        System.out.println("测试完毕");
    }
    
    @Test
    public void testBigYellow() {
        System.out.println("测试鸭子程序");
        
        Duck duck = new BigYellow();
        duck.display();
        duck.fly();
        duck.quack();
        
        System.out.println("测试完毕");
    }
    
    @Test
    public void testSpaceDuck() {
        System.out.println("测试鸭子程序");
        
        Duck duck = new SpaceDuck();
        duck.display();
        duck.fly();
        duck.quack();
        
        System.out.println("测试完毕");
    }

}
