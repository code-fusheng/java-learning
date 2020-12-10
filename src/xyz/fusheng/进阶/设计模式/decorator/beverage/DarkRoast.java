package xyz.fusheng.进阶.设计模式.decorator.beverage; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 12:44
 */

/**
 * @FileName: DarkRoast
 * @Author: code-fusheng
 * @Date: 2020/10/27 12:44
 * @version: 1.0
 * Description: DarkRoast - 超优深培
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast - 超优深培";
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
