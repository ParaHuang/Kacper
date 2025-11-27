package org.example;

import org.example.dao.BaseDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test3 {
    public static void main(String[] args) {

        try {
            // diamond mine
            //1.load up driver  ->  get permitent
            Connection conn = BaseDao.getConnection();
            //3.DML(database manipulation language),get an operation object
            String sql = "delete from studentTb where s_id=14";
            PreparedStatement ps = conn.prepareStatement(sql);
            //4.execute operation
            int result = ps.executeUpdate();
            if(result>0){
                System.out.println("delete successfully");
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
