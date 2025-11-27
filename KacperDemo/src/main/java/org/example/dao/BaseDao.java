package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
    private static String user = "root";
    private static String password = "a123";

    //name:getConnection
    //return:Connection
    //parameter:none
    //level:static  ->  call this method directly with initialize BaseDao
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        //2.get connection  ->  build up a bridge to connect your work place and mine
//            Connection conn = DriverManager.getConnection(the address of database,username,password);
        Connection conn = DriverManager.getConnection(url,user,password);
        return conn;
    }


}
