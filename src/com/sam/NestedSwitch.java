package com.sam;
import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int regno = sc.nextInt();
        String dep = sc.next();

        switch(regno){
            case 1 :
                System.out.println("Samhitha");
                break;
            case 2 :
                System.out.println("Raghav");
                break;
            case 3 :
                System.out.println("Mukundan");
                break;
            case 4 :
                System.out.println("Reg no. is 4");
                switch(dep){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Management" :
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct Reg no.");
        }
    }
}
