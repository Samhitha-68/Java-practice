package com.sam;

public class iv_PassingExample {
    public static void main(String[] args) {
        String name = "Samhitha";
        greet(name);
        changeName(name);
    }
    //in java we have only pass by value we don't have pass by reference
        static void greet(String identity) {
            System.out.println(identity);//both of the reference variable; name and identifier points to the same object
    }
    static void changeName(String modified){
        modified = "Mukundan"; //here only the ogject of modifier is changing not the object of name ; so if name is printed then it will be samhitha and if modifier is printed then it will be mukundan
        //Strings are immutable
        System.out.println(modified);
    }
}
