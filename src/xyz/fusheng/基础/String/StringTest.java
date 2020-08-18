package xyz.fusheng.基础.String;

/**
 * @FileName: StringTest
 * @Author: code-fusheng
 * @Date: 2020/8/18 20:18
 * @version: 1.0
 * Description:
 */

public class StringTest {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "hello";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str1);
        System.out.println(stringBuffer.reverse());     // avaj

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        System.out.println(stringBuilder.reverse());        // olleh
    }
}
