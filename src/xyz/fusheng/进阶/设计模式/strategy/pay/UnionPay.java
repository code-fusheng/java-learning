package xyz.fusheng.进阶.设计模式.strategy.pay;

/**
 * @FileName: UnionPay
 * @Author: code-fusheng
 * @Date: 2020/10/25 23:02
 * @version: 1.0
 * Description: 银联支付类
 */

public class UnionPay implements CommonPay {
    @Override
    public void pay(Integer money) {
        System.out.println("银联支付:" + money + "元。");
    }
}
