package xyz.fusheng.进阶.设计模式.strategy.pay;

/**
 * @FileName: PayType2
 * @Author: code-fusheng
 * @Date: 2020/10/25 23:04
 * @version: 1.0
 * Description: 支付类型枚举
 */

public enum PayType {
    ALI_PAY(new AliPay(), 1, "支付宝付款"),
    WX_PAY(new WxPay(), 2, "微信付款"),
    UNION_PAY(new UnionPay(), 3, "银联付款");

    // 每个枚举实例都会有自己的 commonPay
    private CommonPay commonPay;

    /**
     * code 状态码
     * msg 状态信息
     */
    private Integer code;
    private String msg;

    PayType(CommonPay commonPay, Integer code, String msg) {
        this.commonPay = commonPay;
        this.code = code;
        this.msg = msg;
    }
    public CommonPay getCommonPay() {
        return commonPay;
    }
    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
