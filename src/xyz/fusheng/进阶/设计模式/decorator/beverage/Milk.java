package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 17:57
 */

/**
 * @FileName: Milk
 * @Author: code-fusheng
 * @Date: 2020/10/27 17:57
 * @version: 1.0
 * Description: 牛奶 - 装饰者
 */

public class Milk extends CondimentDecorator {

    Beverage beverage;

    /**
     * 牛奶调料
     * @param beverage
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 牛奶的追加描述
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * 同样的计算价格的方法，继承之后再实现
     * @return
     */
    @Override
    public double cost() {
        return 0.36 + beverage.cost();
    }
}
