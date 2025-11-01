package linkedList;
// My code builds a linked list by adding elements one after another and then prints all its elements in order.

public class implementation {

    // 🔹 Node class represents a single element (node) of the linked list
    public static class Node {
        int data;    // stores data value
        Node next;   // reference (address) of the next node

        // Constructor — called when a new Node is created using 'new'
        Node(int data) {
            this.data = data;   // assign the given data to this node
        }
    }

    // 🔹 LinkedList class manages the whole linked list
    public static class LinkedList {
        Node head = null;   // points to the first node of the list
        Node tail = null;   // points to the last node of the list

        // 🔹 Function to insert a new node at the end of the linked list
        void insertAtEnd(int val) {
            Node temp = new Node(val);   // create a new node with given value

            // If list is empty, new node becomes the first (head)
            if (head == null) {
                head = temp;
            }
            // Otherwise, attach new node after the tail
            else {
                tail.next = temp;
            }
            // Move tail pointer to the newly added node (last node)
            tail = temp;
        }

        // 🔸 Insert a new node at the start of the list
        void insertAtStart(int val){
            Node temp = new Node(val);   // create new node

            if (head == null) {          // if list is empty
                head =tail= temp;
            } else {
                temp.next = head;        // point new node to current head
                head = temp;             // update head to new node
            }
        }


        // 🔹 Function to print all elements of the linked list
        void display() {
            Node temp = head;    // start from the first node
            // Traverse the list until temp becomes null
            while (temp != null) {
                System.out.print(temp.data + " ");  // print data of current node
                temp = temp.next;                   // move to the next node
            }
            System.out.println();
        }
    }

    // 🔹 Main method — program execution starts here
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();  // create an empty linked list

        // Insert elements at the end of the list
        ll.insertAtEnd(4);   // List: 4
        ll.display();        // Output: 4
        ll.insertAtEnd(5);   // List: 4 → 5
        ll.display();        // Output: 4 5
        ll.insertAtEnd(10);  // List: 4 → 5 ->10
        ll.display();        // Output: 4 5 10

        ll.insertAtStart(13); // List: 13-> 4 → 5 ->10
        ll.display(); //13 4 5 10
        // Display all elements
    }
}
