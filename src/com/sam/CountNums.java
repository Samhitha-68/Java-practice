//To check number of times number is repeated
package com.sam;
import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num=sc.nextLong();
        System.out.println("Number to find ? ");
        int find=sc.nextInt();
        int count=0;
        while(num>0){
            if((num%10) == find) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
