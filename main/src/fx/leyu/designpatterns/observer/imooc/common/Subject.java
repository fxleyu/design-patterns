package fx.leyu.designpatterns.observer.imooc.common;

import java.util.ArrayList;
import java.util.List;

/*
 * 目标对象，它知道观察它的观察者，并提供注册（添加）或者删除观察者的接口
 */
public class Subject {
    // 用于保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    //通知所有注册的观察者对象
    protected void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    } 

}
