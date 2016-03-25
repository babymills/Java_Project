package JDBC.main.java.com.babymillsDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by pc on 18.02.2016.
 */
public class Main1 {
    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();
        String query = "select * from uss where username LIKE '%a%'";
        try {
            Statement statement = dbWorker.getConnection().createStatement();
           ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                User user = new User();

                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setAge(resultSet.getInt("age"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
