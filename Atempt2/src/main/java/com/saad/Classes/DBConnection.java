package com.saad.Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
    private static Connection connection;

    static {
        try {
            String url = "jdbc:mysql://localhost:3306/rentwheels";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}