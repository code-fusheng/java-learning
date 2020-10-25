package xyz.fusheng.进阶.设计模式.singleton; /**
 * @author: code-fusheng
 * @Date: 2020/10/18 11:06
 */

/**
 * @FileName: LazyLoadSingleton3
 * @Author: code-fusheng
 * @Date: 2020/10/18 11:06
 * @version: 1.0
 * Description: 单例模式 - 懒汉式 - 减小同步代码块
 */

public class LazyLoadSingleton3 {

    private static LazyLoadSingleton3 INSTANCE;
    private LazyLoadSingleton3() {};
    public static LazyLoadSingleton3 getInstance() {
        if (INSTANCE == null) {
            // 通过减小同步代码块的方式提高效率，但是不可行
            synchronized (LazyLoadSingleton3.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new LazyLoadSingleton3();
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
                System.out.println(LazyLoadSingleton3.getInstance().hashCode());
            }).start();
        }
    }

}
