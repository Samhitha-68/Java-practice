//Scope = The area where a variable is visible and usable
//If a variable is inside a scope,you can use it. If it is outside the scope, Java won't recognize it

package com.sam;

public class vi_Scoping1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String name = "Sam";

        {
            //int a = 78; //here values of the variable that it out of block can be changed or modified , but cannot initialize them again here
            a=100; //reassign the original ref variable to some other value
            int c = 99; //new value initialized
            //value initialized in this block , will remains in this block
            System.out.println(a);
            name = "Samhitha";
            System.out.println(name);

        }
        //System.out.println(c); // gives error as c belongs to above block and this printing happens out of block so it doesnot recognize c
        System.out.println(a);
        System.out.println(name);
    }
}
//Anything that is initialized outside the block, can be used inside the block
//Anything that is initialized inside the block, cannot be used outside the block
//Anything that is initilized outside the block,cannot be again initialized inside the block
//Anything that is initialized iniside the block, can be again initialized outside the block
