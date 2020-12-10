package xyz.fusheng.进阶.设计模式.observer.jdkweather; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 10:29
 */

import java.util.Observable;

/**
 * @FileName: WeatherData
 * @Author: code-fusheng
 * @Date: 2020/10/27 10:29
 * @version: 1.0
 * Description: 气象数据 - 继承 JDK Observable
 */

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    /**
     * 气象数据变化之后先调用 setChanged（）指示状态已经改变
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
