package fx.leyu.designpatterns.observer.imooc;

import java.util.Observer;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        WeatherSubject subject = new WeatherSubject();
        Observer girlFriend = new GirlFriendObserver();
        
        subject.addObserver(girlFriend);
        
        subject.setContent("天气更新了");
    }

}
