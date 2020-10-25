package xyz.fusheng.基础.String; /**
 * @author: code-fusheng
 * @Date: 2020/9/28 18:40
 */

/**
 * @FileName: StringTest2
 * @Author: code-fusheng
 * @Date: 2020/9/28 18:40
 * @version: 1.0
 * Description: String 方法测试
 */

public class StringTest2 {

    public static void main(String[] args) {

        String str = new String();
        String str1 = "hello/world";

        String str2 = str1.replace('h', 'x');
        System.out.println(str2);

        // System.out.println(str1);
        // System.out.println(str1.trim());
        //
        // System.out.println(str1.length());

        System.out.println(str1.charAt(0));

        // System.out.println(str1.indexOf("h"));

        // System.out.println(str1.indexOf("o"));
        // System.out.println(str1.lastIndexOf("o"));

        // System.out.println(str1.substring(0, 4));
        // String[] split = str1.split("/");
        // System.out.println(split.length);
        // for (String c : split) {
        //     System.out.println(c);
        // }

        // int[] num = {1,2,3,4,5,6,7,8,9};
        // for (int n : num) {
        //     System.out.println(n);
        // }

    }

}
