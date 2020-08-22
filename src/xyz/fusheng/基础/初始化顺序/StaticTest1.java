package xyz.fusheng.基础.初始化顺序;

/**
 * @FileName: StaticTest1
 * @Author: code-fusheng
 * @Date: 2020/8/22 11:41
 * @version: 1.0
 * Description: 如何实现在 main() 方法之前输出 “hello world” ?
 */

public class StaticTest1 {

    static {
        System.out.println("执行 static 静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("执行 main() 入口函数");
    }

}
