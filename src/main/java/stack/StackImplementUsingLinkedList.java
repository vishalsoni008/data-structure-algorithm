package stack;

public class StackImplementUsingLinkedList {
    static Node head;

    class Node{
        int data;
        Node next;
    }

    public void push(int data){
        Node node = new Node();
        node.data = data;

        if(head == null){
            head = node;
        }
        else {
            Node n =head;

            while (n.next!=null){
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
        Node node = head;
        while (node.next!=null){
            node= node.next;
        }
        System.out.println("peek element is "+node.data);
    }

    void pop(){
        peek();
    }

    public static void main(String[] args) {
        StackImplementUsingLinkedList stack = new StackImplementUsingLinkedList();

        stack.push(2);
        stack.push(7);
        stack.peek();
        stack.show();

    }
}
