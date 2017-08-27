package fx.leyu.designpatterns.chainofresponsibility.imooc.handler;

public class CEO extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.55) {
            System.out.format("%s 批准了折扣：%.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s 拒绝了折扣：%.2f%n", this.getClass().getName(), discount);
        }
    }

}
