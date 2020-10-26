package xyz.fusheng.进阶.设计模式.Observer.weather; /**
 * @author: code-fusheng
 * @Date: 2020/10/26 16:25
 */

/**
 * @FileName: Observer
 * @Author: code-fusheng
 * @Date: 2020/10/26 16:25
 * @version: 1.0
 * Description: 抽象观察者 Observer
 */

public interface Observer {
    /**
     * 更新数据推送
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temperature, float humidity, float pressure);
}
