package linkedlist;

public class LinkedList {
   static Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;

        if(head == null){
            head =node;
        }
        else {
            Node n =head;
            while (n.next!=null){
                n = n.next;
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


    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAtSpeIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }
       Node n = head;
        for(int i =0;i<index-1;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void midElement(){
        Node fastP = head;
        Node slowP = head;

        while (fastP.next!=null){
            fastP = fastP.next.next;
            slowP = slowP.next;
        }
        System.out.println("mid element is "+slowP.data);
    }

    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node temp = null;
            for(int i=0; i<index-1;i++){
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            System.out.println("deleted element is "+temp.data);
        }
    }

}