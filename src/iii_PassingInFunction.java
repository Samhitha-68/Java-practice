//Strings are immutable but arrays are mutable

import java.util.*;
public class iii_PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 2, 8, 45};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
        static void change(int[] arr){
            arr[5] = 6;
        }
}
