package fx.leyu.designpatterns.adapter.imooc;

public class TwoPlugApdaterExtends extends GBTwoPlug implements ThreePlugInterface {

    @Override
    public void powerWithThree() {
        System.out.println("使用继承完成适配，使用二相电流供电");
        this.powerWithTwo();

    }

}
