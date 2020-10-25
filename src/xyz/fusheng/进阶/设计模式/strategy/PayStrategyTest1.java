package xyz.fusheng.进阶.设计模式.strategy; /**
 * @author: code-fusheng
 * @Date: 2020/10/25 22:46
 */

/**
 * @FileName: PayStrategyTest
 * @Author: code-fusheng
 * @Date: 2020/10/25 22:46
 * @version: 1.0
 * Description: 支付策略测试
 */

public class PayStrategyTest1 {

    public static void main(String[] args) {

        PayType1 type = PayType1.ALI_PAY;

        switch (type) {
            case ALI_PAY:
                System.out.println("支付宝付款操作...");
            case WX_PAL:
                System.out.println("微信付款...");
            case UNION_PAY:
                System.out.println("银联付款...");
            default:
                throw new RuntimeException("未知支付异常...");
        }

    }

}
