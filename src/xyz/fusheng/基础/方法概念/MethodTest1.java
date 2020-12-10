package xyz.fusheng.基础.方法概念; /**
 * @author: code-fusheng
 * @Date: 2020/11/5 19:29
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @FileName: MethodTest1
 * @Author: code-fusheng
 * @Date: 2020/11/5 19:29
 * @version: 1.0
 * Description:
 */

public class MethodTest1 {


    void toHandlerMethod1() {
        System.out.println("憨批");
    }

    int toHandlerMethod2() {
        int i = 1;
        return i;
    }

    String toHandlerMethod3() {
        return "hello word";
    }


    static Connection conn;

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zwh_test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "sa123");
            System.out.println("数据库连城成功!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }



}
