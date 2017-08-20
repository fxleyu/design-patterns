package fx.leyu.designpatterns.proxy.imooc.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
    
    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("开始计时");
        long start = System.currentTimeMillis();
        method.invoke(target);
        System.out.println("计时结束，运行了" + (System.currentTimeMillis() - start)  + " ms");
        return null;
    }

}
