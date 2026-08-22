import java.util.*;
public class vii_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> sam = new ArrayList<>(10);
        sam.add(5);
        sam.add(8);
        sam.add(67);
        sam.add(687);
        sam.add(68);
        sam.add(61);
        sam.add(58);
        sam.add(68);
        sam.add(807);
        sam.add(508);
        sam.add(8283);
        sam.add(278);
        sam.add(125);
        sam.add(999);
        sam.add(7);

        System.out.println("List is : " + sam);
        System.out.println(sam.contains(68));
        System.out.println(sam.get(3));
        System.out.println(sam.set(0,11));   //to change
        System.out.println(sam.remove(3));
        System.out.println("Updated list is : " + sam);
    }
}
