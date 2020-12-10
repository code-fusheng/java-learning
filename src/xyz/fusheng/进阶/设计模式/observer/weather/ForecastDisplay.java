package xyz.fusheng.进阶.设计模式.observer.weather; /**
 * @author: code-fusheng
 * @Date: 2020/10/26 23:24
 */

/**
 * @FileName: ForecastDisplay
 * @Author: code-fusheng
 * @Date: 2020/10/26 23:24
 * @version: 1.0
 * Description: 天气预报布告板
 */

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("天气预报: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
