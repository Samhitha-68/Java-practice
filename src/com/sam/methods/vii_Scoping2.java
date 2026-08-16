//scoping in for loop
package com.sam.methods;

public class vii_Scoping2 {
    public static void main(String[] args) {
        int a=80;

        for(int i=1;i<5;i++){
            System.out.println(i);
            a=100000;
        }
        //System.out.println(i); // provides error as it is outside the block
        System.out.println(a);
    }
}
