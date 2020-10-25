package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: EnumSingleton1
 * @Author: code-fusheng
 * @Date: 2020/10/18 11:36
 * @version: 1.0
 * Description: Java 创始人 - 枚举单例
 * 解决线程同步与反序列化
 */

public enum  EnumSingleton1 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                // 不同对象的 hashCode 是不同的
                System.out.println(EnumSingleton1.INSTANCE.hashCode());
            }).start();
        }
    }
}
