package fx.leyu.designpatterns.chainofresponsibility.imooc.handler;

/*
 *  价格处理人，负责处理客户的折扣申请
 */
public abstract class PriceHandler {
    // 直接后继，用于传递请求。
    protected PriceHandler successor;
    
    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }
    
    // 处理折扣申请
    public abstract void processDiscount(float discount);

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
