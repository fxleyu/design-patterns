package fx.leyu.designpatterns.observer.imooc;

import java.util.Observable;
import java.util.Observer;

public class GirlFriendObserver implements Observer {

    private String content;
    

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public void update(Observable o, Object arg) {
        // 推的方式
        System.out.println("content 收到了 " + arg);
        
        // 拉的方式
        System.out.println("Observable is " + o.getClass().getName());
    }

}
