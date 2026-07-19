package com.sam;
import java.util.Arrays;
public class v_ChangeValue {
    public static void main(String[] args) {
    int[] arr = {8,6,4,9};
    change(arr);
        System.out.println(Arrays.toString(arr));
        //if brackets needed to be changed , use replace operation
        System.out.println(Arrays.toString(arr).replace("[" , "{").replace("]" , "}"));
    }
    static void change(int[] input){
        input[0] = 5; //if you make a change to the object via this ref variable, same object will be changed
    }
}
