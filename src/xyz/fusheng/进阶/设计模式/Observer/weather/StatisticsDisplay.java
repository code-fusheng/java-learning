package xyz.fusheng.进阶.设计模式.Observer.weather; /**
 * @author: code-fusheng
 * @Date: 2020/10/26 22:54
 */

/**
 * @FileName: StatisticsDisplay
 * @Author: code-fusheng
 * @Date: 2020/10/26 22:54
 * @version: 1.0
 * Description: 数据统计布告板
 */

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum = 0.0f;
    // 记录观测的次数以便计算平均值
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum += temperature;
        numReadings ++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("天气统计: " + (temperatureSum / numReadings) + "/" + maxTemperature + "/" + minTemperature);
    }

}
