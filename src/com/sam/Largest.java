//find the largest of three numbers
package com.sam;
import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>max){
            max=n3;
        }
        System.out.println(max + " is maximum");

        //Alternative method : use Math.max
        System.out.println(Math.max(n1,Math.max(n2,n3))); //Math.max only finds the maximum between 2 numbers
    }
}
