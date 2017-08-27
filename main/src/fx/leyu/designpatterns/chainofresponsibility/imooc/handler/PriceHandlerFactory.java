package fx.leyu.designpatterns.chainofresponsibility.imooc.handler;

public class PriceHandlerFactory {

    // 创建PriceHandler的工厂方法
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler ceo = new CEO();
        
        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);
        
        return sales;
    }

}