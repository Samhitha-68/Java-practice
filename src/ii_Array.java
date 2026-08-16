import java.util.*;
public class ii_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter n : "));
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter n element : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j : arr)   //Enhanced for loop
        System.out.println(j);

        System.out.println("Enter n strings :");
        String[] str = new String[n];
        for(int i =0;i<n;i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
