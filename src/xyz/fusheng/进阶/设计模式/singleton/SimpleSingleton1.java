package xyz.fusheng.进阶.设计模式.singleton;

/**
 * @FileName: SimpleSingleton
 * @Author: code-fusheng
 * @Date: 2020/10/18 9:49
 * @version: 1.0
 * Description: 简单的单例模式 - 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全（JVM保证每个类只被加载一次，同时在类加载的时候，static静态变量会初始化）
 * 简单实用，常用推荐
 * 唯一缺点: 不管是否需要使用，都会在类加载时进行实例化
 */

public class SimpleSingleton1 {

    // 静态成员变量 INSTANCE 会在类加载时进行初始化，final 保证始终不变
    private static final SimpleSingleton1 INSTANCE = new SimpleSingleton1();

    // 私有化构造方法
    private SimpleSingleton1() {};

    // 对外允许调用的方法，返回的是同一个实例对象
    public static SimpleSingleton1 getInstance() {
        return INSTANCE;
    }

    // 测试代码块 - 检测多次调用 getInstance() 的返回对象是否唯一
    public static void main(String[] args) {
        SimpleSingleton1 singleton1 = SimpleSingleton1.getInstance();
        SimpleSingleton1 singleton2 = SimpleSingleton1.getInstance();
        // true
        System.out.println(singleton1 == singleton2);
    }

}
