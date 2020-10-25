package xyz.fusheng.进阶.JVM; /**
 * @author: code-fusheng
 * @Date: 2020/9/20 12:18
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @FileName: JVMStack
 * @Author: code-fusheng
 * @Date: 2020/9/20 12:18
 * @version: 1.0
 * Description: JVM 虚拟机栈
 */

public class JVMStack {

    public static void main(String[] args) {
        JVMStack jvmStack = new JVMStack();
        jvmStack.methodA();
    }

    public void methodA() {
        int i = 10;
        int j = 20;
        methodB();
        // methodC();
        try {
            methodD();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void methodB() {
        int k = 30;
        int m = 40;
    }

    public void methodC() {
        int a = 10;
        int b = 0;
        int c = a/b;
    }

    public void methodD() throws FileNotFoundException {
        FileReader fis = new FileReader("test.txt");
    }

}
