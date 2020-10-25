package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: LazyLoadSingleton2
 * @Author: code-fusheng
 * @Date: 2020/10/18 10:59
 * @version: 1.0
 * Description: 懒汉式 - 单例模式 加锁
 */

public class LazyLoadSingleton2 {

    private static LazyLoadSingleton2 INSTANCE;
    private LazyLoadSingleton2() {};
    // static 的 synchronized 锁定的是 LazyLoadSingleton2 对象
    public static synchronized LazyLoadSingleton2 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new LazyLoadSingleton2();
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
                System.out.println(LazyLoadSingleton2.getInstance().hashCode());
            }).start();
        }
    }

}
