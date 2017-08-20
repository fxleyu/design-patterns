package fx.leyu.designpatterns.proxy.imooc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

import fx.leyu.designpatterns.proxy.imooc.jdk.TimeHandler;

public class Client {
    
    @Test
    public void test() {
        Moveable moveableImpl = new Car();
        moveableImpl = new CarLogProxy(moveableImpl);
        moveableImpl = new CarTimeProxy(moveableImpl);
        moveableImpl.move();
    }
    
    @Test
    public void jdkProxyTest() {
        Moveable moveableImpl = new Car();
        InvocationHandler handler = new TimeHandler(moveableImpl);
        Class<?> cls = moveableImpl.getClass();
        System.out.println("cls = " + cls.getName());
        
        moveableImpl = (Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        moveableImpl.move();
    }

}
