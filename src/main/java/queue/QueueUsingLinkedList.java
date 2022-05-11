package queue;

public class QueueUsingLinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;
    }

    void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
        }
        else {
            Node n = head;
            while (n.next!= null){
                n = n.next;
            }
            n.next = node;
        }
    }

    void show(){
        Node node = head;
        while (node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    void peek(){
        System.out.println("peek data is "+head.data);
    }

    void pop(){
        Node node = head;
        System.out.println("pop element is "+head.data);
        node.next = head.next;
        head = head.next;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.insert(1);
        queueUsingLinkedList.insert(2);
        queueUsingLinkedList.insert(3);
        queueUsingLinkedList.peek();
        queueUsingLinkedList.pop();
        queueUsingLinkedList.peek();
        queueUsingLinkedList.show();
    }
}