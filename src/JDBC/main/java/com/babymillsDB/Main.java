package JDBC.main.java.com.babymillsDB;

import java.sql.*;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
/**
 * Created by pc on 17.02.2016.
 */
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mybd";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static void main(String[] args) {
        Connection connection;

        try{
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

        }catch (SQLException e){
            System.out.println("FAILED");
        }
        try{
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            System.out.println(!connection.isClosed());
            statement.executeUpdate("UPDATE user SET name='nate',age=1 WHERE id = 5;");
        }catch (SQLException e){
            System.out.println("FAILED");

    }




}}
