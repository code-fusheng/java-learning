package xyz.fusheng.进阶.设计模式.observer.jdkweather; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 10:43
 */

/**
 * @FileName: WeatherStation
 * @Author: code-fusheng
 * @Date: 2020/10/27 10:43
 * @version: 1.0
 * Description: 气象站测试
 */

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
