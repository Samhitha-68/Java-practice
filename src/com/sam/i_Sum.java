package com.sam;
import java.util.*;
public class i_Sum {
    public static void main(String[] args) {
        sum();    //Function call
        int ans = mul();   //mul() will return value and that value is stored in ans
        System.out.println("Multiply gives : " + ans);
    }

        /*
    return_type name () {
        //body
        return statement;
    }
     */

    static void sum(){                    //since the sum() block is static this block too should be static.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter num2 : ");
        int n2=sc.nextInt();
        int add=n1+n2;
        System.out.println("Sum is : " + add);
    }

    //to return the value :
    static int mul(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num3 : ");
        int n3=sc.nextInt();
        System.out.println("Enter num4 : ");
        int n4=sc.nextInt();
        int multi=n3*n4;
        return multi;  //return = function ends (so function ends here)
    }

}