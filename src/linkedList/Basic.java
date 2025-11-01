package linkedList;

public class Basic {
    public static void main(String[] args) {
        Node a= new Node(5);
        System.out.println(a.next);  // null

        Node b= new Node(3);
        Node c= new Node(8);
        Node d= new Node(13);

        a.next =b;
        b.next=c;
        c.next=d;
        System.out.println(c.data);  //8
//        System.out.println(a.next);  //linkedList.Basic$Node@6acbcfc0
//        System.out.println(b);  //linkedList.Basic$Node@6acbcfc0
    }

    public static class Node{
        int data ;  //value
        Node next;  // address of next node

        Node(int data){
            this.data= data;
        }
    }
}
