//fixed no.of rows and columns

import java.util.*;
public class v_MultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];

        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(arr1[i]));
            }
    }
}
