package linkedlist.doubly;

public class DoubleLinkedList {

    static Node head;

    class Node{
        int data;
        Node previous;
        Node next;
    }
    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;

        node.next = head;
        node.previous = null;
        head = node;
    }

    void show(){
        Node n = head;
        while (n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertAtStart(1);
        doubleLinkedList.insertAtStart(2);
        doubleLinkedList.show();

    }
}
