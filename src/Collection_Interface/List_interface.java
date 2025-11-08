package Collection_Interface;
import java.util.*;
public class List_interface {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Abhiraj");
        list.add("Rahul");
        list.add("Binod");
        list.add("Aloo");

        list.remove("Rahul");
        System.out.println(list);
        System.out.println(list.size());// Return 3
        System.out.println(list.get(2));//Returns aloo

    }
}
