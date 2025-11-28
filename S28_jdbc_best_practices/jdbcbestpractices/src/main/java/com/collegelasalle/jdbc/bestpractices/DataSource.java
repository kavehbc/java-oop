package com.collegelasalle.jdbc.bestpractices;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
// import java.nio.file.Path;
// import java.nio.file.Paths;

public class DataSource  implements AutoCloseable {

    private static Connection connection;
    private static String DBName = "ContactDB";

    public static Connection getConnection(){
        return getConnection(DBName);
    }

    public static Connection getConnection(String DBName){
        Properties properties = new Properties();

        // to get current working directory
        // Path currentWorkingDirectoryPath = Paths.get("").toAbsolutePath().normalize();
        // System.out.println("Current Working Directory: " + currentWorkingDirectoryPath.toString());

        try (FileInputStream fis = new FileInputStream("database.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Failed to load database properties.");
            e.printStackTrace();
            return null;
        }

        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        String connectionUrl = url + "databaseName=" + DBName + ";user=" + username + ";password=" + password;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
            return null;
        }
        return connection;
    }

    @Override
    public void close() throws Exception {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

}
