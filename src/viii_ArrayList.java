import java.util.ArrayList;
import java.util.Scanner;
public class viii_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>(5);

        for (int i=0;i<5;i++){
            str.add(sc.nextLine());
        }
        for (int i=0;i<5;i++){
            System.out.println(str.get(i));
        }
        str.add("Dates");
        str.add("Kiwi");
        System.out.println(str);
    }
}
