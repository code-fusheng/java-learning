package xyz.fusheng.进阶.设计模式.observer.weather; /**
 * @author: code-fusheng
 * @Date: 2020/10/26 16:37
 */

import java.util.ArrayList;

/**
 * @FileName: WeatherData
 * @Author: code-fusheng
 * @Date: 2020/10/26 16:37
 * @version: 1.0
 * Description: 具体主题 WeatherData
 */

public class WeatherData implements Subject {

    /**
     * 主题维护一个 ArrayList 集合，用来记录观察者
     */
    private ArrayList observers;

    /**
     * WeatherData 状态
     * 温度 湿度 气压
     */
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 在构造器中创建 ArrayList
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 当注册观察者时，只需要添加到 ArrayList 集合中即可
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 观察者想取消，只需从 ArrayList 中删除即可
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者，因为每个观察者都实现了 update,所以我们知道如何通知它们
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 测量数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
