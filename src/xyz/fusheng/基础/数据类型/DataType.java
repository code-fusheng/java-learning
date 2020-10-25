package xyz.fusheng.基础.数据类型; /**
 * @author: code-fusheng
 * @Date: 2020/9/28 10:13
 */

import sun.misc.Unsafe;

/**
 * @FileName: DataType
 * @Author: code-fusheng
 * @Date: 2020/9/28 10:13
 * @version: 1.0
 * Description: 数据类型
 */

public class DataType {

    public static void integerTest() {
        // 整数类型

        // byte -128 ~ 127 占1字节
        byte testByte = 124;

        // short -32768 ~ 32767 占2字节
        short testShort = 32564;

        // int
        int testInt = 54123819;
        // 最小值 -2147483648
        System.out.println(Integer.MIN_VALUE);
        // 最大值 2147483647
        System.out.println(Integer.MAX_VALUE);

        // long
        long testLong = 367372829292L;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }

    public static void floatTest() {
        // float 类型数据务必使用 f 标志
        float testFloat = 13.14f;
        // double 类型数据不做 d 要求 系统会默认小数是 double 类型
        double testDouble1 = 13.14;
        double testDouble2 = 13.14d;
    }

    public static void charTest() {
        char word1 = 'd', word2 = '@', word3 = '?';
        int p1 = 23045, p2 = 63;
        // 显示转换
        System.out.println((int)word1);
        System.out.println((int)word2);
        System.out.println((int)word3);
        System.out.println((char)p1);
        System.out.println((char)p2);
    }

    public static void booleanTest() {
        boolean flag1;
        boolean flag2 = false;
        boolean flag3 = true;
    }

    public static void main(String[] args) {

        // 整数类型测试
        System.out.println("***********************************************");
        integerTest();
        // 浮点类型测试
        System.out.println("***********************************************");
        floatTest();
        // 字符类型测试
        System.out.println("***********************************************");
        charTest();
        // 布尔测试
        System.out.println("***********************************************");
        booleanTest();
    }

}
