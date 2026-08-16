//Armstrong number
package com.sam.methods;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = Armstrong(num);
        System.out.println(ans);

        //printing all three digit armstrong number
        for (int i = 100; i < 1000; i++) {
            if (Armstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean Armstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            int a = rem * rem * rem;
            sum = sum + a;
            n = n/10;
        }
        return sum == original;
    }

}
