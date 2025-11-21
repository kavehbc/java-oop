package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test SQL Server Connection");

        // connection string to SQL Server
        // Update the connection string to trust the server certificate
        String connectionUrl = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=TestDB;user=sa;password=12345";

        try {
            // Establish the connection
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection to SQL Server established successfully.");

            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM names";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}