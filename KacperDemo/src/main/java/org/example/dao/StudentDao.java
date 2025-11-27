package org.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    //1.add student
    public int addStudent(){
        try {
            Connection conn = BaseDao.getConnection();
            String sql = "insert into studentTb values (null,'Kate',13,'f','A7')";
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;  //negative number represent exception happened
    }

    //2.remove student by id
    public int deleteStudent(String id){
        try {
            Connection conn = BaseDao.getConnection();
            String sql = "delete from studentTb where s_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setXxxxx(which question mark , what value);     //18->"18"
            ps.setString(1,id);
            int result = ps.executeUpdate();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;  //negative number represent exception happened
    }

    //3.modify student by id
    public int updateStudent(){
        try {
            Connection conn = BaseDao.getConnection();
            String sql = "update studentTb set s_name='Susan',s_age=19 where s_id=15";
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;  //negative number represent exception happened
    }


    //4.query student under conditions


}
