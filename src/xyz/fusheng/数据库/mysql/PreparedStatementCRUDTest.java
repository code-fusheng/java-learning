package xyz.fusheng.数据库.mysql;

import java.sql.*;

/**
 * @FileName: PreparedStatementCRUDTest
 * @Author: code-fusheng
 * @Date: 2020/10/28 8:14
 * @version: 1.0
 * Description:
 */

public class PreparedStatementCRUDTest {

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

        PreparedStatementCRUDTest crudTest = new PreparedStatementCRUDTest();
        connection = crudTest.getConnection();

        try {

            // 此处执行的是添加修改前的查询操作
            preparedStatement = connection.prepareStatement("select * from t_user");
            resultSet = preparedStatement.executeQuery();
            System.out.println("执行增加、删除、修改前的数据:");
            while (resultSet.next()) {
                // 获取主键列的值
                String id = resultSet.getString("id");
                // 获取列名是 name 的值
                String name = resultSet.getString("name");
                // 获取列名是 sex 的值
                String sex = resultSet.getString("sex");
                // 获取列名是 age 的值
                int age = resultSet.getInt("age");
                System.out.println(" 编号: " + id + " 姓名: " + name + " 性别: " + sex + " 年龄: " + age);
            }

            // 此处执行的是添加操作
            preparedStatement = connection.prepareStatement("insert into t_user values (?, ?, ?, ?)");
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "xxx");
            preparedStatement.setString(3, "男");
            preparedStatement.setInt(4, 21);
            preparedStatement.executeUpdate();

            // 此处执行的是添加后的查询操作
            preparedStatement = connection.prepareStatement("select * from t_user");
            resultSet = preparedStatement.executeQuery();
            System.out.println("执行增加后的数据:");
            while (resultSet.next()) {
                // 获取主键列的值
                String id = resultSet.getString("id");
                // 获取列名是 name 的值
                String name = resultSet.getString("name");
                // 获取列名是 sex 的值
                String sex = resultSet.getString("sex");
                // 获取列名是 age 的值
                int age = resultSet.getInt("age");
                System.out.println(" 编号: " + id + " 姓名: " + name + " 性别: " + sex + " 年龄: " + age);
            }

            // 此处执行的是更新操作
            preparedStatement = connection.prepareStatement("update t_user set name = ? where id = ? ");
            preparedStatement.setInt(2, 3);
            preparedStatement.setString(1, "test");
            preparedStatement.executeUpdate();

            // 此处执行的是更新后的查询操作
            preparedStatement = connection.prepareStatement("select * from t_user");
            resultSet = preparedStatement.executeQuery();
            System.out.println("执行增加、修改后的数据:");
            while (resultSet.next()) {
                // 获取主键列的值
                String id = resultSet.getString("id");
                // 获取列名是 name 的值
                String name = resultSet.getString("name");
                // 获取列名是 sex 的值
                String sex = resultSet.getString("sex");
                // 获取列名是 age 的值
                int age = resultSet.getInt("age");
                System.out.println(" 编号: " + id + " 姓名: " + name + " 性别: " + sex + " 年龄: " + age);
            }

            // 此次执行的是删除操作
            preparedStatement = connection.prepareStatement("delete from t_user where id = ?");
            preparedStatement.setInt(1, 3);
            preparedStatement.executeUpdate();

            // 此处执行的是删除后的查询操作
            preparedStatement = connection.prepareStatement("select * from t_user");
            resultSet = preparedStatement.executeQuery();
            System.out.println("执行增加、修改、删除后的数据:");
            while (resultSet.next()) {
                // 获取主键列的值
                String id = resultSet.getString("id");
                // 获取列名是 name 的值
                String name = resultSet.getString("name");
                // 获取列名是 sex 的值
                String sex = resultSet.getString("sex");
                // 获取列名是 age 的值
                int age = resultSet.getInt("age");
                System.out.println(" 编号: " + id + " 姓名: " + name + " 性别: " + sex + " 年龄: " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
