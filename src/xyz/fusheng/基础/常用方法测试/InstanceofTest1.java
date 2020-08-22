package xyz.fusheng.基础.常用方法测试;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @FileName: InstanceofTest1
 * @Author: code-fusheng
 * @Date: 2020/8/22 12:25
 * @version: 1.0
 * Description: instanceof 是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。
 * 通常结合没有方法的接口（标识接口）使用
 */

public class InstanceofTest1 {

    public static void main(String[] args) {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }

    public static void displayObjectClass(Object o) {
        if (o instanceof Vector) {
            System.out.println("对象是 java.util.Vector 类的实例");
        } else if (o instanceof ArrayList) {
            System.out.println("对象是 java.util.ArrayList 类的实例");
        } else {
            System.out.println("对象是 " + o.getClass() + " 类的实例");
        }
    }

}
