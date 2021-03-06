package fx.leyu.designpatterns.chainofresponsibility.imooc;

import fx.leyu.designpatterns.chainofresponsibility.imooc.handler.PriceHandler;

public class Customer {
    private PriceHandler priceHandler;
    
    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }
    
    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
