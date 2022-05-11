package linkedlist.single;

public class LinkedListApp {

    static Node head;
    static Node lastPointer;
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
            lastPointer = node;
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

    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next=null;

        node.next = head;
        head = node;
    }

    void insetAtSpcIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next=null;

        if(index == 0){
            insertAtStart(data);
        }
        Node n = head;
        for(int i =0 ;i<index-1;i++){
             n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void deleteAtIndex(int index){
        if(index == 0){
            head =head.next;
        }
        else{
            Node n = head;
            Node temp = null;
            for(int i = 0; i<index-1;i++){
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            System.out.println("deleted element is "+temp.data);
        }
    }
    public Node reverse(Node node){
        Node current = head;
        Node nxt = null;
        Node privious = null;

        while (current!=null){
            nxt = current.next;
            current.next = privious;
            privious = current;
            current = nxt;
        }
        node = privious;
        return  node;
    }
    void lastValue(){
        System.out.println("last element is "+lastPointer.data);
    }
    public static void main(String[] args) {
        LinkedListApp linkedListApp = new LinkedListApp();

        for(int  i=0; i<=4;i++){
            linkedListApp.insert(i);
        }
        linkedListApp.midElement();
        linkedListApp.insertAtStart(11);
        linkedListApp.insetAtSpcIndex(2,22);
        linkedListApp.deleteAtIndex(2);
        linkedListApp.show();
       // System.out.println("revers linked list is");
      //  head = linkedListApp.reverse(head);
        linkedListApp.lastValue();
        linkedListApp.show();
    }
}
