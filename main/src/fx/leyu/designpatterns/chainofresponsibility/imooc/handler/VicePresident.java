package fx.leyu.designpatterns.chainofresponsibility.imooc.handler;

public class VicePresident extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.5) {
            System.out.format("%s 批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }

}
