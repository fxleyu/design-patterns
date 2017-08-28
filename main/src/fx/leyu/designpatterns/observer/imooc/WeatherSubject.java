package fx.leyu.designpatterns.observer.imooc;

import java.util.Observable;

// 天气目标的具体实现
public class WeatherSubject extends Observable {

    private String content;
    
    public void setContent(String content) {
        this.content = content;
        setChanged();
        // 推模型
        //notifyObservers(content);
        
        // 拉方法
        notifyObservers();
    }

}
