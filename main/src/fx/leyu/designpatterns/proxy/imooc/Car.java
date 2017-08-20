package fx.leyu.designpatterns.proxy.imooc;

public class Car implements Moveable {

    @Override
    public void move() {
        System.out.println("汽车开始行驶");
        System.out.println("汽车行驶中...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
                        e.printStackTrace();
        }
        System.out.println("汽车到达目的地");
    }

}
