package org.example;

import org.example.dao.BaseDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) {

        try {
            Connection conn = BaseDao.getConnection();
            //3.DML(database manipulation language),get an operation object
            String sql = "insert into studentTb values (null,'Kate',13,'f','A7')";
            PreparedStatement ps = conn.prepareStatement(sql);
            //4.execute operation
            int result = ps.executeUpdate();
            if(result>0){
                System.out.println("add successfully");
            }else{
                System.out.println("something went wrong");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();    //print it in console
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("the end");
    }
}
