package xyz.fusheng.进阶.JVM; /**
 * @author: code-fusheng
 * @Date: 2020/9/20 12:56
 */

/**
 * @FileName: StackErrorTest
 * @Author: code-fusheng
 * @Date: 2020/9/20 12:56
 * @version: 1.0
 * Description: 虚拟机栈异常测试
 * 默认栈大小 -> 11404
 * 设置栈大小 -Xss256k -> 2474
 *
 */

public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }

}
