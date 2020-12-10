package xyz.fusheng.进阶.设计模式.decorator.javaIO; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 19:15
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @FileName: InputTest
 * @Author: code-fusheng
 * @Date: 2020/10/27 19:15
 * @version: 1.0
 * Description: I/O 测试类
 */

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("G:\\【code-fusheng】\\【Java】\\Java 源码\\java-learning\\src\\xyz\\fusheng\\进阶\\设计模式\\decorator\\javaIO\\test.txt")
                    )
            );
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
