package com.sam;
import java.util.*;

public class iii_WithArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        sum(x,y,z);

        String msg = exp("Addition");
        System.out.println(msg);
    }

    static void sum(int n1 , int n2 , int n3){
        int addition = n1 + n2 + n3;
        System.out.println(addition);
    }

    static String exp(String name){
        String message = name + " means adding two numbers ";
        return message;
    }

}