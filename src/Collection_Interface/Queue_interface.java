package Collection_Interface;
import java.util.*;
public class Queue_interface {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
    }
}
