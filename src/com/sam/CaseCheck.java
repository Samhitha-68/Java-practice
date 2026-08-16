//To check wheather  a letter is lower case or upper case
package com.sam;
import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        if(ch >='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
    }
}
