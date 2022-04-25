package linkedlist;

public class LinkedListApp {

    static Node head;
    class Node{
          int data;
         Node next;
    }
    public void insert(int data){
        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }
        else {
            Node  n =head;
            while (n.next!=null){
                n= n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void midElement() {
        Node fasTPointer = head;
        Node slowPointer = head;

        while (fasTPointer.next != null){
            fasTPointer = fasTPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println("middle element is "+slowPointer.data);
    }
    public static void main(String[] args) {
        LinkedListApp linkedListApp = new LinkedListApp();

        for(int  i=0; i<=4;i++){
            linkedListApp.insert(i);
        }

        linkedListApp.show();
        linkedListApp.midElement();
    }
}
