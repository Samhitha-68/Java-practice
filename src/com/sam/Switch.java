package com.sam;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter valid fruit");
        }
    }
}

