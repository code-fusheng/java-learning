package xyz.fusheng.数据库.mysql; /**
 * @author: code-fusheng
 * @Date: 2020/10/28 8:02
 */

import java.sql.*;

/**
 * @FileName: PreparedStatementTest
 * @Author: code-fusheng
 * @Date: 2020/10/28 8:02
 * @version: 1.0
 * Description: 预处理操作测试
 */

public class PreparedStatementTest {

    static Connection connection;
    static PreparedStatement preparedStatement;
    static ResultSet resultSet;

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

        PreparedStatementTest psTest = new PreparedStatementTest();
        connection = psTest.getConnection();

        try {
            // 实例化预处理参数
            preparedStatement = connection.prepareStatement("select * from t_user where id = ?");
            // 设置参数
            preparedStatement.setInt(1, 1);
            // 执行预处理语句
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                // 获取结果集中第一列的值
                String str = resultSet.getString(1);
                // 获取 name 列的列值
                String name = resultSet.getString("name");
                // 获取 sex 列的列值
                String sex = resultSet.getString("sex");
                // 获取 age 列的列值
                int age = resultSet.getInt("age");
                System.out.println(" 编号: " + str + " 姓名: " + name + " 性别: " + sex + " 年龄: " + age);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
