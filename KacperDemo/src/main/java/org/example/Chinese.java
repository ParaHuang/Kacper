package org.example;

//inheritance
//public class SubClass extends SuperClass{}
public class Chinese extends Human{
    //override method:SubClass rewrite the methods from SuperClass
    @Override
    public void eat() {
        System.out.println("Chinese eat with chopsticks");
    }
}
