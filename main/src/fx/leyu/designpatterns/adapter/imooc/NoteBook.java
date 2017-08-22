package fx.leyu.designpatterns.adapter.imooc;

public class NoteBook {
    
    private ThreePlugInterface plug;
    
    public NoteBook(ThreePlugInterface plug) {
        this.plug = plug;
    }
    
    // 使用插座充电
    public void charge() {
       plug.powerWithThree(); 
    }
    
    public static void main(String[] args) {
        GBTwoPlug twoPlug = new GBTwoPlug();
        ThreePlugInterface three = new TwoPlugAdapter(twoPlug);
        NoteBook noteBook = new NoteBook(three);
        noteBook.charge();
        
        ThreePlugInterface other = new TwoPlugApdaterExtends();
        noteBook = new NoteBook(other);
        noteBook.charge();


    }

}
