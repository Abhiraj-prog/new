package linkedList;

public class Check_circular {

        // Node class representing each element
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
            }
        }

        // Function to check if the linked list is circular
        static boolean isCircular(Node head) {
            if (head == null) return false; // empty list is not circular

            Node slow = head;
            Node fast = head;

            // Move slow by 1 and fast by 2
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                // If they meet, cycle exists
                if (slow == fast)
                    return true;
            }

            // If fast reaches null, list ends — not circular
            return false;
        }

        public static void main(String[] args) {
            // Create nodes
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);

            // Create a normal (non-circular) list: 1 → 2 → 3 → 4 → null
            a.next = b;
            b.next = c;
            c.next = d;

            System.out.println("Is list circular? " + isCircular(a)); // false

            // Now make it circular: 4 → 2
            d.next = b;
            System.out.println("Is list circular? " + isCircular(a)); // true
        }
}
