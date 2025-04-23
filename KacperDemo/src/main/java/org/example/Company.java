package org.example;

public class Company {
    //methods overloading:methods have same name, but different parameters
    //invite people, and people eat here
    /*
    public void havingParty(American american){
        System.out.println("party begins----");
        american.eat();
        System.out.println("party finished, go home");
    }
    public void havingParty(Chinese chinese){
        System.out.println("party begins----");
        chinese.eat();
        System.out.println("party finished, go home");
    }
    public void havingParty(Polish polish){
        System.out.println("party begins----");
        polish.eat();
        System.out.println("party finished, go home");
    }
    */


    //Polimorphim:1 things shows in different way
    public void havingParty(Human human){
        System.out.println("party begins----");
        human.eat();
        System.out.println("party finished, go home");
    }
//    public void havingParty(Chinese chinese,American american){
//        System.out.println("party begins----");
//        chinese.eat();
//        System.out.println("party finished, go home");
//    }

}
