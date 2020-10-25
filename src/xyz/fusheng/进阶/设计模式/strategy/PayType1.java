package xyz.fusheng.进阶.设计模式.strategy;

/**
 * @FileName: PayType
 * @Author: code-fusheng
 * @Date: 2020/10/25 22:38
 * @version: 1.0
 * Description: 字符类型
 */

public enum PayType1 {

    ALI_PAY(1, "支付宝付款"),
    WX_PAL(2, "微信付款"),
    UNION_PAY(3, "银联付款");

    /**
     * code 状态码
     * msg 状态信息
     */
    private Integer code;
    private String msg;

    PayType1(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }
}
