package xyz.fusheng.进阶.设计模式.Observer.weather; /**
 * @author: code-fusheng
 * @Date: 2020/10/26 22:39
 */

/**
 * @FileName: WeatherStation
 * @Author: code-fusheng
 * @Date: 2020/10/26 22:39
 * @version: 1.0
 * Description: 气象站测试类
 */

public class WeatherStation {

    public static void main(String[] args) {
        // 创建 weatherData 对象
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }

}
