package xyz.fusheng.进阶.设计模式.strategy.pay;

/**
 * @FileName: Customer
 * @Author: code-fusheng
 * @Date: 2020/10/25 23:11
 * @version: 1.0
 * Description: 消费者类
 */

public class Customer {
    public void pay(PayType payType, Integer money) {
        payType.getCommonPay().pay(money);
    }
}
