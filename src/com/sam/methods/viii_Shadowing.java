package com.sam.methods;

public class viii_Shadowing {
    static int a=68; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a); //68
        int a=44; //the class variable at line 4 is shadowed by thismodification; a=44
        System.out.println(a); //44
        fun();
    }

    static void fun(){
        System.out.println(a);  //68
    }
}
