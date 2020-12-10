package xyz.fusheng.数据库.mysql; /**
 * @author: code-fusheng
 * @Date: 2020/10/28 7:39
 */

import java.sql.*;

/**
 * @FileName: SelectTest
 * @Author: code-fusheng
 * @Date: 2020/10/28 7:39
 * @version: 1.0
 * Description: Statement 操作测试
 */

public class StatementTest {

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // 连接数据库 zwh_test 是当前连接的数据库[库名]
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zwh_test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "sa123");
            System.out.println("数据库连接成功!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {

        /**
         * 创建本类对象
         */
        StatementTest sTest = new StatementTest();
        /**
         * 与数据库建立链接
         */
        connection = sTest.getConnection();
        try {
            statement = connection.createStatement();   // 实例化 statement 对象
            resultSet = statement.executeQuery("select * from t_user where id = 1");
            while (resultSet.next()) {
                // 获取主键列的值
                int id = resultSet.getInt("id");
                // 获取列名是 name 的值
                String name = resultSet.getString("name");
                // 获取列名是 sex 的值
                String sex = resultSet.getString("sex");
                // 获取列名是 age 的值
                int age = resultSet.getInt("age");
                System.out.println(" 编号: " + id + " 姓名: " + name + " 性别: " + sex + " 年龄: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
