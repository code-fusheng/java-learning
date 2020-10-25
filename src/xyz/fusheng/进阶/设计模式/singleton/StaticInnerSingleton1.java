package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: StaticInnerSingleton1
 * @Author: code-fusheng
 * @Date: 2020/10/18 11:22
 * @version: 1.0
 * Description: 静态内部类法 - 完美
 * 懒加载 - 外部类在类加载的时候不会实例化内部类
 * 线程安全 - JVM 只加载一次类
 */

public class StaticInnerSingleton1 {

    private StaticInnerSingleton1() {}

    // 静态内部类 - SingletonHolder
    private static class SingletonHolder {
        // 初始化外部类对象
        private final static StaticInnerSingleton1 INSTANCE = new StaticInnerSingleton1();
    }

    public static StaticInnerSingleton1 getInstance() {
        // 返回静态内部类的 INSTANCE
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                // 不同对象的 hashCode 是不同的
                System.out.println(StaticInnerSingleton1.getInstance().hashCode());
            }).start();
        }
    }
}
