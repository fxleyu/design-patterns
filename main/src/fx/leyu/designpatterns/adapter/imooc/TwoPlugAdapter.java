package fx.leyu.designpatterns.adapter.imooc;

/**
 * 
 * 二相转三相适配器
 * 
 * 组合适配器
 *
 */
public class TwoPlugAdapter implements ThreePlugInterface {
    
    private GBTwoPlug twoPlug;

    public TwoPlugAdapter(GBTwoPlug twoPlug) {
        this.twoPlug = twoPlug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        twoPlug.powerWithTwo();

    }

}
