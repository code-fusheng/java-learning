package xyz.fusheng.进阶.设计模式.strategy.pay;

/**
 * @FileName: WXPay
 * @Author: code-fusheng
 * @Date: 2020/10/25 23:01
 * @version: 1.0
 * Description: 微信支付类
 */

public class WxPay implements CommonPay {
    @Override
    public void pay(Integer money) {
        System.out.println("微信支付:" + money + "元。");
    }
}
