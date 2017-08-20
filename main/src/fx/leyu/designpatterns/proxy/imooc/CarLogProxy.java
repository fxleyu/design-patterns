package fx.leyu.designpatterns.proxy.imooc;

public class CarLogProxy implements Moveable {

    private Moveable moveableImpl;
    
    public CarLogProxy(Moveable moveableImpl) {
        this.moveableImpl = moveableImpl;
    }
    
    @Override
    public void move() {
        System.out.println("Log开始记录");
        moveableImpl.move();
        System.out.println("Log结束记录");
    }

}
