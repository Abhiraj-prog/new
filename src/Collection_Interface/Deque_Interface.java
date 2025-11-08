package Collection_Interface;
import java.util.*;

public class Deque_Interface {
    public static void main(String[] args) {
        Deque<Integer> deque =new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);

        System.out.println(deque);  //[2, 1, 3, 4, 5]

        deque.remove();  //also removes first [1, 3, 4, 5]
        deque.removeFirst();  //[3, 4, 5]
        deque.removeLast();  //[3, 4]

        System.out.println(deque);  //[3, 4]
    }
}
