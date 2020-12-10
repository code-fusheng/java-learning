package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 12:30
 */

/**
 * @FileName: Beverage
 * @Author: code-fusheng
 * @Date: 2020/10/27 12:30
 * @version: 1.0
 * Description: 饮料 抽象类
 */

public abstract class Beverage {

    /**
     * 描述
     */
    String description = "Unknown Beverage - 未知饮料";

    /**
     * 抽象类中实现了描述
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * cost() 必须在子类中实现
     * @return
     */
    public abstract double cost();
}
