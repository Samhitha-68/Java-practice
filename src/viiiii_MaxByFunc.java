import java.util.*;
public class viiiii_MaxByFunc {

    static int max(int[] arr){
        int maxi=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxi && arr[i]!=maxi){
                maxi=arr[i];
            }else{
                return -1;
            }
        }
        return maxi;
    }

    static int maxBetween(int[] ar , int s , int e ) {
        int maximum = ar[s];
        for (int i = s; i <= e; i++) {
            if (ar[i] > maximum && ar[i] != maximum) {
                maximum = ar[i];
            }else{
                return -1;
            }
        }
        return maximum;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of elements : ");
            int n = sc.nextInt();
            System.out.println("Enter the elements : ");
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Greatest of elements is : ");
            System.out.println(max(arr));
            System.out.println("starting and ending index : ");
            int start = sc.nextInt();
            int stop = sc.nextInt();
            System.out.println("Greatest number between starting and ending index is : ");
            System.out.println(maxBetween(arr, start, stop));
        }
    }
