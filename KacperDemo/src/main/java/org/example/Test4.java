package org.example;

import org.example.dao.StudentDao;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //add a student
        StudentDao dao = new StudentDao();
        Scanner scanner = new Scanner(System.in);

//        int result1 = dao.addStudent();
//        System.out.println(result1>0?"successfully":"error");
        System.out.println("which student do you want to delete?");
        String id = scanner.nextLine();
        int result2 = dao.deleteStudent(id);
        System.out.println(result2>0?"successfully":"error");

//        int result3 = dao.updateStudent();
//        System.out.println(result3>0?"successfully":"error");
    }
}
