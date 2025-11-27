package org.example;

import org.example.dao.BaseDao;

public class Test2 {
    public static void main(String[] args) {
//        System.out.println("the beginning of program");
//        try {
//            int a = 10 / 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("the end of program");

        //call the a() of BaseDao
        //"18"  -> 18
        String str = "18";
        int x = Integer.parseInt(str);


        BaseDao db = new BaseDao();
//        db.a();
//        db.getConnection();
    }
}
