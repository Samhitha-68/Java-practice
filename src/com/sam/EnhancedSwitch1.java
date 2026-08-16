package com.sam;
import java.util.*;

public class EnhancedSwitch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit = sc.next();

        //this is switch statement,to get an enhanced switch statement press alt+enter and select enhanced switch

    switch (fruit) {
    case "Mango" -> System.out.println("King of fruit");
                case "Apple" -> System.out.println("A sweet red fruit");
                case "Orange" -> System.out.println("Round fruit");
                case "Grapes" -> System.out.println("Small fruit");
    default -> System.out.println("Enter valid fruit");
            }
    }
}
