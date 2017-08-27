package fx.leyu.designpatterns.chainofresponsibility.imooc.handler;

/*
 *  价格处理人，负责处理客户的折扣申请
 */
public abstract class PriceHandler {
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }
    
    // 处理折扣申请
    public abstract void processDiscount(float discount);

}
