package xyz.fusheng.数据库.mysql; /**
 * @author: code-fusheng
 * @Date: 2020/10/28 7:05
 */

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @FileName: ConnectionTest
 * @Author: code-fusheng
 * @Date: 2020/10/28 7:05
 * @version: 1.0
 * Description: 数据库连接测试类
 */

public class ConnectionTest {

    /**
     * 连接对象
     */
    Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zwh_test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "sa123");
            System.out.println("数据库连城成功!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {

        // 创建本类对象
        ConnectionTest cTest1 = new ConnectionTest();
        cTest1.getConnection();

    }

}
