package xyz.fusheng.常用;

/**
 * @FileName: StringToInt
 * @Author: code-fusheng
 * @Date: 2020/9/1 12:08
 * @version: 1.0
 * Description: 字符串转整数
 */

public class StringToInt {

    public static void main(String[] args) {

        // 测试数据
        String test1 = "123456";
        String test2 = "123456";

        // 字符串转整数 String -> int

        // 方法一: 直接使用静态方法，不会产生多余的对象，但会抛出异常
        int int1 = Integer.parseInt(test1);
        System.out.println(int1);
        // 方法二: Integer.valueOf(s) 相当于 new Integer(Integer.parseInt(s))，也会抛异常，同时会多产生一个对象
        int int2 = Integer.valueOf(test2).intValue();
        System.out.println(int2);

    }

}
