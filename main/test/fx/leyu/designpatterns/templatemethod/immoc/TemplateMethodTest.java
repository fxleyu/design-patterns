package fx.leyu.designpatterns.templatemethod.immoc;

import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void testCoffee() {
        System.out.println("制备咖啡");
        RefreshBeverage beverage = new Coffee();
        beverage.prepareBeverageTemplete();
        System.out.println("咖啡好了");
    }
    
    @Test
    public void testTea() {
        System.out.println("制备茶");
        RefreshBeverage beverage = new Tea();
        beverage.prepareBeverageTemplete();
        System.out.println("茶好了");
    }

}
