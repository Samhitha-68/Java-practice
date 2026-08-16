import java.util.*;
public class iv_MultiDimArray {
    public static void main(String[] args) {
        //int[][] arr = new int[3][];  //column is not mandatory to mention as column no. can differ
        int[][] arr = {{13, 34, 5}, {6, 8}, {9, 1, 2, 3, 4}};

        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}
