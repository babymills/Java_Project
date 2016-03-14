package JDBC.main.java.less7;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.fabric.xmlrpc.base.Data;
import com.sun.org.apache.regexp.internal.RE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Calendar;

/**
 * Created by pc on 19.02.2016.
 */
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String INSERT_NEW = "Insert into dish values (?,?,?,?,?,?,?)";//запрос доб
    private static final String GET_ALL = "Select * from dish";//   запрос вывод



    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Connection connection = null;//соединение
        PreparedStatement preparedStatement = null;
        try {

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            preparedStatement = connection.prepareStatement(GET_ALL);//отдаем запрос стменту
            /*preparedStatement.setInt(1, 2);//принимает индетиф парметр
            preparedStatement.setString(2, "Insert Title");
            preparedStatement.setString(3, "Insert desc");
            preparedStatement.setFloat(4, 0.2f);
            preparedStatement.setBoolean(5, true);
            preparedStatement.setDate(6, new Date(Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setBlob(7, new FileInputStream("logo.png"));*/
            ResultSet resultSet = preparedStatement.executeQuery();//выполнение стетмента
            while(resultSet.next()) {//некст пока есть строки
                int Id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String desc = resultSet.getString("description");
                float rating = resultSet.getFloat("rating");
                boolean published = resultSet.getBoolean("published");
                Date date = resultSet.getDate("created");
byte[]icon = resultSet.getBytes("icon");
                System.out.println("id " +Id +" title "+title+" desc "+desc+" rating "+rating+
                        " published " + published+" icon "+icon.length);

            }
        }catch (SQLException e){
e.printStackTrace();
        }

    }
}
