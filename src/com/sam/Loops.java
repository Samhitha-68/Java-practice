package com.sam;
import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        /*
        syntax of for loop :
            for(initialisation;condition;increament/decrement){
                //body
             }
         */
        System.out.println("In while loop: ");
        for(int i=0;i<=n;i+=5){
            System.out.println(i);
        }

        /*
        syntax for while loop :
            while(condition){
            //body
           }
         */
        System.out.println("In while loop: ");
        int k=0;
        while(k<=n){
            System.out.println(k);
            k+=5;
        }

        /*
        syntax for do-while loop :
            do{
                //body
            }while(condition);
         */
        System.out.println("In do-while loop: ");
        int j=0;
        do{
            System.out.println(j);
            j+=5;
        } while(j<=n);
    }
}