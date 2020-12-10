package xyz.fusheng.进阶.设计模式.observer.weather;

/**
 * @FileName: Subject
 * @Author: code-fusheng
 * @Date: 2020/10/26 16:23
 * @version: 1.0
 * Description: 抽象主体 Subject
 */

public interface Subject {

    // register 和 remove 都需要一个观察者作为变量，用来注册和删除
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // 当主题状态改变时，这个方法会被调用，以通知所有的观察者
    public void notifyObserver();

}
