package com.collegelasalle.jdbc.bestpractices;

import java.util.HashMap;
import java.util.Map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDB {

    private Map<String, String> contact;
    private Connection connection;

    public ContactDB(){
        // Establish the connection
        connection = DataSource.getConnection(); 
    }

    public boolean addContact(String name, String phoneNumber) {
        try {
            // checking if name exists
            String sql = "SELECT COUNT(*) AS count FROM contact WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();

            int count = 0;
            while (rs.next()) {
                count = rs.getInt("count");
            }

            rs.close();
            statement.close();

            if (count > 0) {
                // contact already exists
                System.out.println("Contact already exists");
                return false;
            } else {
                // db.put(name, phoneNumber);
                sql = "INSERT INTO contact (name, phoneNumber) VALUES (?, ?)";
                statement = connection.prepareStatement(sql);
                statement.setString(1, name);
                statement.setString(2, phoneNumber);
                int affectedRows = statement.executeUpdate();
                if (affectedRows > 0) {
                    System.out.println("Contact added successfully");
                }
                statement.close();
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
            String sql = "UPDTE contact SET phoneNumber = ? WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, phoneNumber);
            statement.setString(2, name);
            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Contact updated successfully");
            }
            statement.close();
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
            String sql = "SELECT * FROM contact WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                phoneNumber = rs.getString("phoneNumber");
            }

            rs.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        }
        return phoneNumber;
    }

    public boolean deleteContact(String name) {
        try {            
            String sql = "DELETE FROM contact WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            int affectedRows = statement.executeUpdate();
            statement.close();

            if (affectedRows > 0) {
                System.out.println("Contact deleted successfully");
                return true;
            } else {
                System.out.println("No contact found with the given name");
                return false;
            }
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
            Statement statement = connection.createStatement();
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
