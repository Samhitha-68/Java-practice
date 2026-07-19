package com.sam;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input from user until they press X or x
        int ans=0;
        while(true){
            System.out.println("Enter the operation : ");
            char op=sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
                System.out.println("Enter two numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }
                else if(op=='-'){
                    ans=num1-num2;
                }
                else if(op=='*'){
                    ans=num1*num2;
                }
                else if(op=='/'){
                    if(num2 != 0){
                        ans=num1/num2;
                    }
                }
                else if(op=='%') {
                    ans = num1 % num2;
                }
            }else if(op == 'X' || op == 'x') {
                break;
            }else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}
