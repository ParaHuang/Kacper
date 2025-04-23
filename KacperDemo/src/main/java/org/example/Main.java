package org.example;

import java.util.Random;

/*
OOP:object oriented programing
encapsulation:for code safety(generally make attribute private,methods public,access private attribute by public method)
inheritance:for code reuse(Subclass will extend public members from SuperClass)
polimorphism: for code flexibility (1 things shows in different way. 2 precondition :override and reference change)
 */
public class Main {
    public static void main(String[] args) {
        /*
        Human human1 = new Human();
        human1.eat();
        human1.sleep();
        System.out.println("----");

        American american = new American();
        american.eat();
        american.sleep();
        System.out.println("----");

        Chinese chinese = new Chinese();
        chinese.eat();
        chinese.sleep();
*/
        American american = new American();
        Chinese chinese = new Chinese();
        Polish polish = new Polish();


        Company company = new Company();

        company.havingParty(american);
        System.out.println();
        company.havingParty(chinese);
        System.out.println();
        company.havingParty(polish);

        //reference change
        Human human = new American();
        //American x = new Human();

    }
}


