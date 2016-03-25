package JDBC.main.java.com.babymillsDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by pc on 18.02.2016.
 */
public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private Connection connection;
public DBWorker(){

    try {
        connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
