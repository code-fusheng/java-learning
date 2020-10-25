package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: SimpleSingleton2
 * @Author: code-fusheng
 * @Date: 2020/10/18 10:19
 * @version: 1.0
 * Description: 简单的单例模式与SimpleSingleton1相似
 */

public class SimpleSingleton2 {
    private static final SimpleSingleton2 INSTANCE;
    static {
        INSTANCE = new SimpleSingleton2();
    }
    private SimpleSingleton2() {};
    public static SimpleSingleton2 getInstance() {
        return INSTANCE;
    }
    public static void main(String[] args) {
        SimpleSingleton2 singleton1 = SimpleSingleton2.getInstance();
        SimpleSingleton2 singleton2 = SimpleSingleton2.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
