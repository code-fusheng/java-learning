package xyz.fusheng.进阶.JVM; /**
 * @author: code-fusheng
 * @Date: 2020/9/16 16:00
 */

import sun.misc.Launcher;

import java.net.URL;
import java.sql.SQLOutput;

/**
 * @FileName: ClassLoaderTest2
 * @Author: code-fusheng
 * @Date: 2020/9/16 16:00
 * @version: 1.0
 * Description: 获取类加载器能够加载的路径
 */

public class ClassLoaderTest2 {

    public static void main(String[] args) {

        System.out.println("启动类加载器");
        // 获取BootstrapClassLoader能够加载的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }

        System.out.println("扩展类加载器");
        // 获取ExtClassLoader能够加载的路径
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
    }

}
