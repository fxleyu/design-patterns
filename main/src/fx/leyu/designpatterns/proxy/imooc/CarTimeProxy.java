package fx.leyu.designpatterns.proxy.imooc;

public class CarTimeProxy implements Moveable {
    
    private Moveable moveableImpl;
    
    public CarTimeProxy(Moveable moveableImpl) {
        this.moveableImpl = moveableImpl;
    }

    @Override
    public void move() {
        System.out.println("开始计时");
        long start = System.currentTimeMillis();
        moveableImpl.move();
        System.out.println("计时结束，运行了" + (System.currentTimeMillis() - start)  + " ms");
    }

}
