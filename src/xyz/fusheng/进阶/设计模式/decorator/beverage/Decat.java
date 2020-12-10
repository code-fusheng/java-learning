package xyz.fusheng.进阶.设计模式.decorator.beverage;

/**
 * @FileName: Decat
 * @Author: code-fusheng
 * @Date: 2020/10/27 12:41
 * @version: 1.0
 * Description: Decat  - 具体饮料的实现
 */

public class Decat extends Beverage {

    public Decat() {
        description = "Decat - 一种饮料";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
