package xyz.fusheng.进阶.设计模式.strategy.pay;

/**
 * @FileName: PayStrategyTest2
 * @Author: code-fusheng
 * @Date: 2020/10/25 23:13
 * @version: 1.0
 * Description: 测试类
 */

public class PayStrategyTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.pay(PayType.ALI_PAY, 100);

        Customer customer2 = new Customer();
        customer2.pay(PayType.UNION_PAY, 200);
        
    }
}
