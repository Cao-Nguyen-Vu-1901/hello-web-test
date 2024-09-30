package com.example.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectDb {
    // JDBC URL, username và password cho MySQL
    private static final String JDBC_URL = "jdbc:mysql://junction.proxy.rlwy.net:15194/railway";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "yVQaoLKVfONVqXqrJsWfDeRfVaarlmbu";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("Kết nối thành công tới MySQL Public!");
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại!");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Đã đóng kết nối.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
