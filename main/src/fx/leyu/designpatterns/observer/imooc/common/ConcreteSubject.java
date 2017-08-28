package fx.leyu.designpatterns.observer.imooc.common;

/*
 * 具体目标对象，负责把有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject {
    // 目标对象的状态
    private String subjectState;
    
    public ConcreteSubject() {
        // TODO Auto-generated constructor stub
    }
    
    public String getSubjectState() {
        return subjectState;
    }
    
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObserver();
    }

}
