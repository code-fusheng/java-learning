package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: LazyLoadSingleton4
 * @Author: code-fusheng
 * @Date: 2020/10/18 11:11
 * @version: 1.0
 * Description: 双重校验锁机制
 * PS: 双重校验锁机制不适用于 1.4 以及更早之前的 Java 版本
 */

public class LazyLoadSingleton4 {
    // JIT 指令重排
    // volatile 关键字确保，当 INSTANCE 常量 被初始化成 LazyLoadSingleton4 实例时，多个线程正确的处理 INSTANCE 常量
    private static volatile LazyLoadSingleton4 INSTANCE;
    private LazyLoadSingleton4() {};
    public static LazyLoadSingleton4 getInstance() {
        // 双重校验
        // 检查实例，如果不存在就进入同步代码块
        if (INSTANCE == null) {
            synchronized (LazyLoadSingleton4.class) {
                // 进入之后再检查一次，如果不存在才创建实例
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new LazyLoadSingleton4();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 测试代码块
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(LazyLoadSingleton4.getInstance().hashCode());
            }).start();
        }
    }

}
