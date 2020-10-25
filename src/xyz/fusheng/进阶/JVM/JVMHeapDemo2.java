package xyz.fusheng.进阶.JVM; /**
 * @author: code-fusheng
 * @Date: 2020/9/23 10:41
 */

/**
 * @FileName: JVMHeapDemo
 * @Author: code-fusheng
 * @Date: 2020/9/23 10:41
 * @version: 1.0
 * Description: JVM 堆测试
 * -Xms20m -Xmx20m
 */

public class JVMHeapDemo2 {

    public static void main(String[] args) {

        System.out.println("start.....");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end......");
    }

}
