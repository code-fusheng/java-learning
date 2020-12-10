package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 12:56
 */

/**
 * @FileName: Mocha
 * @Author: code-fusheng
 * @Date: 2020/10/27 12:56
 * @version: 1.0
 * Description: 摩卡 - 装饰者 拓展自 CondimentDecorator
 */

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    /**
     * 想办法让被装饰者（饮料）被记录在实例变量中。
     * 这里的做法是: 把饮料当做构造器的参数，再由构造器将此饮料记录在实例变量中
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 在描述中，除了描述饮料，同时还希望将完善的调料描述出来，所以利用委托的做法，得到一个描述，在其后追加描述。
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 要计算带 Mocha调料 的饮料的价钱，首先把调用委托给被装饰对象，以计算价钱，然后再加上 Mocha 的价钱。
     * @return
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

}
