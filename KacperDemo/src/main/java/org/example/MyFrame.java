package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//frame:window
public class MyFrame extends JFrame {
    public static void main(String[] args) {
        //create MyFrame object
        MyFrame frame = new MyFrame();
        //set it visible
        frame.setVisible(true);
    }
    //constructor
    public MyFrame(){
        //basic setup for MyFrame
        System.out.println("creating a frame");
        setTitle("My First Frame");
        setSize(500,400);
//        setLocation(400,400);
        setLocationRelativeTo(this);
        //setup shut down the program when MyFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set some content inside
        //Content Pane
        //1.get the Content area
        Container container = getContentPane();
        //2.layout(default:BorderLayout)
        container.setLayout(null);      //absolute layout

        //3.create some component , add it into content area
        JButton btn = new JButton("click me");
//        container.add(btn,BorderLayout.SOUTH);//default center
        btn.setBounds(100,100,200,50);
        container.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //whatever you want to do when you click on the button, you write it here
//                System.out.println("hello");
                JOptionPane.showMessageDialog(MyFrame.this,"Don't Click me");
            }
        });
        //JLabel        : show text
        //JTextField    : input box



    }

}
