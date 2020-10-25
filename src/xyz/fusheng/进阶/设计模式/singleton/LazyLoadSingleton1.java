package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: LazyLoadSingleton1
 * @Author: code-fusheng
 * @Date: 2020/10/18 10:28
 * @version: 1.0
 * Description: 懒汉式 - 单例模式
 * 多线程访问问题
 */

public class LazyLoadSingleton1 {

    // 静态变量 此处不能加 final PS: final 常量需要进行初始化
    private static LazyLoadSingleton1 INSTANCE;
    // 私有构造函数
    private LazyLoadSingleton1() {};
    // 对象实例初始化方法
    public static LazyLoadSingleton1 getInstance() {
        // 判断是否为空
        if (INSTANCE == null) {
            // 情景模拟代码块开始
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 情景模拟代码块结束
            // 判断为空进行初始化
            INSTANCE = new LazyLoadSingleton1();
        }
        // 判断不为空返回原来对的实例
        return INSTANCE;
    }

    /**
     * 测试代码块
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                // 不同对象的 hashCode 是不同的
                System.out.println(LazyLoadSingleton1.getInstance().hashCode());
            }).start();
        }
    }
}
