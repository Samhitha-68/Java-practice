package com.sam.methods;
import java.util.Arrays;

public class ix_VarArgs {
    public static void main(String[] args) {
        fun(1,3,5,7,9,55,74,87);
        multiple(6,8,"sam","raghav","thiru","suhail");
    }

    static void multiple(int a, int b, String ...r){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(r));

    }

    static void fun(int ...v){  //representation to stores integers/strings/char etc.. as arryas and here no length needed to be initialized
        System.out.println(Arrays.toString(v));
    }
}
