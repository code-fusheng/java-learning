package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 12:34
 */

/**
 * @FileName: Condiment
 * @Author: code-fusheng
 * @Date: 2020/10/27 12:34
 * @version: 1.0
 * Description: 调料抽象类 - 装饰类
 */

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
