import java.util.ArrayList;
import java.util.Scanner;
public class ix_MulArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();  //two array list till here

        for(int i=0;i<3;i++){
            arr.add(new ArrayList<>());    //creating 3 arrays
        }

            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    arr.get(i).add(sc.nextInt());    //4 elements in 3 arrays
            }
        }
        System.out.println(arr);
    }
}
