package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 17:38
 */

/**
 * @FileName: StarbuzzCoffee
 * @Author: code-fusheng
 * @Date: 2020/10/27 17:38
 * @version: 1.0
 * Description: 订单测试代码
 */

public class StarbuzzCoffee {

    public static void main(String[] args) {

        /**
         * 订一杯 Espresso, 不需要调料，打印它的描述与价钱
         */
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        /**
         * 订一杯 DarkRoast
         */
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        /**
         *  订一杯 Decat
         */
        Beverage beverage3 = new Decat();
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }

}
