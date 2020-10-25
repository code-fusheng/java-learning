package xyz.fusheng.进阶.JVM; /**
 * @author: code-fusheng
 * @Date: 2020/9/20 17:02
 */

/**
 * @FileName: OperandStackTest
 * @Author: code-fusheng
 * @Date: 2020/9/20 17:02
 * @version: 1.0
 * Description: 操作数栈测试
 */

public class OperandStackTest {

    public void testAddOperation() {
        // byte、short、char、boolean 都以 int 类型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;
    }



}
