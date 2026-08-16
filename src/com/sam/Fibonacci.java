//Whats the nth fibonacci number ?
package com.sam;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        if(n==1) System.out.println('0');
        if(n==2) System.out.println('1');
        int a=0;   //1st
        int b=1;   //2nd
        int temp=0;
        for(int i=3;i<=n;i++){
            temp=a + b;
            a=b;
            b=temp;
        }
        System.out.println(n + "th fibonacci number is : " + temp + " using for loop");

        //using for-loop
        int j=3;
        int a1=0;
        int b1=1;
        int tem=0;
        while(j<=n){
            tem=a1+b1;
            a1=b1;
            b1=tem;
            j++;
        }
        System.out.println(n + "th fibonacci number is : " + b1 + " using while loop");
    }
}
