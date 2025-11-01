package linkedList;

public class Basic {

    public static int leng(Node head){  // prints length of linked list
        int count =0;
        while(head!=null){
            count++;
            head =head.next;
        }
        return count;
    }

    public static void displayR(Node head){  // printing linked list using Recursion
        if(head==null) return;
        System.out.print(head.data);  //5 3  8 13
        displayR(head.next);

        displayR(head.next);
        System.out.print(head.data);  //13 8 3 5 it prints in reverse order
    }
    public static  void display(Node head){  //printing linked list using loop
        Node temp=head;
//        for(int i=1;i<=4;i++){
//            System.out.print(temp.data+" "); //5 3 8 13
//            temp =temp.next;
//        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }

    public static class Node{
        int data ;  //value
        Node next;  // address of next node

        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(5);  // head
        Node b= new Node(3);
        Node c= new Node(8);
        Node d= new Node(13);

        a.next =b;
        b.next=c;
        c.next=d;
        System.out.println(leng(a)); // prints length of linked list
//        display(a);
//        displayR(a);

//        System.out.println(c.next.data);  //13
//        System.out.println(a.next);  //linkedList.Basic$Node@6acbcfc0
//        System.out.println(b);  //linkedList.Basic$Node@6acbcfc0
    }


}
