package Collection_Interface;
import java.util.*;
public class Set_Interface {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cat");
        set.add("Dog");
        set.add("Elephant");
        set.add("Frog");

        System.out.println(set);  // [Apple, Frog, Cat, Elephant, Dog, Banana]
        // cannot remove elements from indexes
    }
}
