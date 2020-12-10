package xyz.fusheng.进阶.设计模式.observer.jdkweather; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 10:39
 */

import java.util.Observable;
import java.util.Observer;

/**
 * @FileName: CurrentConditionsDisplay
 * @Author: code-fusheng
 * @Date: 2020/10/27 10:39
 * @version: 1.0
 * Description: 当前信息布告板
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("当前信息: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
