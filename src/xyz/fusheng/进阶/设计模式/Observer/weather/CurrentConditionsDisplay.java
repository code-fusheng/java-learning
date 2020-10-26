package xyz.fusheng.进阶.设计模式.Observer.weather; /**
 * @author: code-fusheng
 * @Date: 2020/10/26 22:22
 */

/**
 * @FileName: CurrentConditionsDisplay
 * @Author: code-fusheng
 * @Date: 2020/10/26 22:22
 * @version: 1.0
 * Description: 目前状况布告板
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 构造器需要 weatherData 对象（也就是主题）作为注册之用
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前信息: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
