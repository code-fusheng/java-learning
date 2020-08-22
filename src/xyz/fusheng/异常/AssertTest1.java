package xyz.fusheng.异常;

/**
 * @FileName: AssertTest
 * @Author: code-fusheng
 * @Date: 2020/8/22 14:51
 * @version: 1.0
 * Description: assert 断言测试
 */

public class AssertTest1 {

    public static void main(String[] args) {

        assert 1 + 1 == 2;
        System.out.println("assert1 ok");

        assert 1 + 1 == 3 : "assert fail, exit";
        System.out.println("assert2 ok");


    }

}
