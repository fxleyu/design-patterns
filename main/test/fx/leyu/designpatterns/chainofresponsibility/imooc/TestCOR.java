package fx.leyu.designpatterns.chainofresponsibility.imooc;

import java.util.Random;

import org.junit.Test;

import fx.leyu.designpatterns.chainofresponsibility.imooc.handler.PriceHandler;

public class TestCOR {

    @Test
    public void main() {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandler.createPriceHandler());
        
        customer.requestDiscount(0.01f);
        
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.print(i+" : ");
            customer.requestDiscount(random.nextFloat());
        }
        
    }

}
