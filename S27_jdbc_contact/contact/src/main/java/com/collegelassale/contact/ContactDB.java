package com.collegelassale.contact;

import java.util.HashMap;
import java.util.Map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDB implements AutoCloseable{

    private Map<String, String> contact;
    private Connection connection;
    private Statement statement;

    public ContactDB() {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=ContactDB;user=sa;password=12345";

        try {
            // Establish the connection
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();

            // Close the connection
            // connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }

    }

    @Override
    public void close() throws Exception {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public boolean addContact(String name, String phoneNumber) {
        try {
            // checking if name exists
            String sql = "SELECT COUNT(*) AS count FROM contact WHERE name = '" + name + "'";
            ResultSet rs = statement.executeQuery(sql);

            int count = 0;
            while (rs.next()) {
                count = rs.getInt("count");
            }

            if (count > 0) {
                // contact already exists
                System.out.println("Contact already exists");
                return false;
            } else {
                // db.put(name, phoneNumber);
                sql = "INSERT INTO contact (name, phoneNumber) VALUES ('" + name + "', '" + phoneNumber + "')";
                statement.executeUpdate(sql);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
            return false;
        }

    }

    public boolean updateContact(String name, String phoneNumber) {
        try {            
            String sql = "UPDTE contact SET phoneNumber = '" + phoneNumber + "' WHERE name = '" + name + "'";
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
            return false;
        }

    }

    public String getContact(String name) {
        String phoneNumber = null;
        try {            
            String sql = "SELECT * FROM contact WHERE name = '" + name + "'";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                phoneNumber = rs.getString("phoneNumber");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        }
        return phoneNumber;
    }

    public boolean deleteContact(String name) {
        try {            
            String sql = "DELETE FROM contact WHERE name = '" + name + "'";
            statement.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public Map<String, String> getAllContacts() {
        contact = new HashMap<>();
        try {            
            String sql = "SELECT * FROM contact";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                String phoneNumber = rs.getString("phoneNumber");
                contact.put(name, phoneNumber);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        }
        return contact;
    }
}
