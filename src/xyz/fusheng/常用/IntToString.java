package xyz.fusheng.常用;

/**
 * @FileName: IntToString
 * @Author: code-fusheng
 * @Date: 2020/9/1 11:53
 * @version: 1.0
 * Description: 整数转字符串
 */

public class IntToString {

    public static void main(String[] args) {

        // 测试数据
        int test1 = 1314;
        int test2 = 520;
        int test3 = 666;

        // 整型转字符串

        // 方法一: valueOf
        System.out.println("转换后 test1 的类型为:" + String.valueOf(test1).getClass().getTypeName());
        // 方法二: toString
        System.out.println("转换后 test2 的类型为:" +Integer.toString(test2).getClass().getTypeName());
        // 方法三: "" +
        System.out.println("转换后 test3 的类型为:" + ("" + test3).getClass().getTypeName());

    }

}
