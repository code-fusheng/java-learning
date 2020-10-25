package xyz.fusheng.进阶.设计模式.singleton; /**
 * @author: code-fusheng
 * @Date: 2020/10/18 9:52
 */

/**
 * @FileName: Test
 * @Author: code-fusheng
 * @Date: 2020/10/18 9:52
 * @version: 1.0
 * Description:
 */

public class Test {
    public static void main(String[] args) {
        // 禁止
        // new SimpleSingleton();
        // 允许
        SimpleSingleton1 singleton = SimpleSingleton1.getInstance();
    }
}
