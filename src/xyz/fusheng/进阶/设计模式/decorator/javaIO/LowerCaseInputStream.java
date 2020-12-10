package xyz.fusheng.进阶.设计模式.decorator.javaIO; /**
 * @author: code-fusheng
 * @Date: 2020/10/27 18:44
 */

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @FileName: LowerCaseInputStream
 * @Author: code-fusheng
 * @Date: 2020/10/27 18:44
 * @version: 1.0
 * Description: 自定义 I/O 装饰者类
 * FilterInputStream 是所有 InputStream 的抽象装饰者
 */

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i > offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}


