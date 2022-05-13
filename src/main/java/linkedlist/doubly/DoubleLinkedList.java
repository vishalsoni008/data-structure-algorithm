package linkedlist.doubly;

public class DoubleLinkedList {

    static Node head;
    static Node tail;

    static class Node{
        int data;
        Node previous;
        Node next;
    }
    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;

        node.next= head;
        head = node;
        node.previous = null;
    }

    void show(){
        Node n = head;
        while (n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    void push(int data){
        Node node = new Node();
        node.data = data;

        if (head == null){
            head = tail = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.push(3);
        doubleLinkedList.push(4);
        doubleLinkedList.push(5);
        doubleLinkedList.insertAtStart(2);
        doubleLinkedList.insertAtStart(1);
        doubleLinkedList.show();

    }
}
