package xyz.fusheng.进阶.设计模式.strategy.pay;

/**
 * @FileName: AliPay
 * @Author: code-fusheng
 * @Date: 2020/10/25 22:55
 * @version: 1.0
 * Description: 支付宝支付类
 */

public class AliPay implements CommonPay {
    @Override
    public void pay(Integer money) {
        System.out.println("支付宝支付:" + money + "元。");
    }
}
