package xyz.fusheng.进阶.JVM; /**
 * @author: code-fusheng
 * @Date: 2020/9/16 15:21
 */

/**
 * @FileName: ClassLoaderTest1
 * @Author: code-fusheng
 * @Date: 2020/9/16 15:21
 * @version: 1.0
 * Description: 类加载器分类 - 包含关系、非继承
 */

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        // 获取类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        // sun.misc.Launcher$AppClassLoader@18b4aac2

        // 扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);
        // sun.misc.Launcher$ExtClassLoader@1540e19d

        // C C++ 语言写的，获取不到引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);
        // null

        // 用户自定义类
        ClassLoader classLoader = ClassLoaderTest1.class.getClassLoader();
        System.out.println(classLoader);
        // sun.misc.Launcher$AppClassLoader@18b4aac2

        // String类使用引导类加载器进行加载的 --> Java 的核心类库都是由引导类加载器加载
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);
        // null
    }
}
