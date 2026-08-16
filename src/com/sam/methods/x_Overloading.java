//Function Overloading : 2 functions of the same name can exist with different parameters
package com.sam.methods;

public class x_Overloading {
    public static void main(String[] args) {
        fun(68);      //enter into the func that have int as its parameter
        fun("Sam");  //enter into the func that have String as its parameter
        int ans1 = sum(5,5);
        int ans2 = sum(6,6,6);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String word){
        System.out.println(word);
    }

    static int sum(int r,int s){
        return r + s;
    }
    static int sum(int x,int y,int z){
        return x + y + z;
    }
}
