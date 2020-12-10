package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 12:36
 */

/**
 * @FileName: Espresso
 * @Author: code-fusheng
 * @Date: 2020/10/27 12:36
 * @version: 1.0
 * Description: 浓缩咖啡 - 具体饮料的实现
 */

public class Espresso extends Beverage {


    /**
     * 在构造器中设置饮料的描述， description 变量继承自 Beverage
     */
    public Espresso() {
        description = "Espresso - 浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
