package linkedlist.single;

public class CompleteLinkedListOperations {

    static Node head;

    class Node{
        int data;
        Node next;
    }

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
       else {
           Node  n = head;
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

   public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
   }

   public void insertAtSpecIndex(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0){
            insertAtStart(data);
        }
        else {
            Node n = head;
            for (int  i=0;i < index-1;i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
   }

   public void deleteAT(int index){
        if(index == 0){
            head = head.next;
        }
        else {
            Node n = head;
            Node n1= null;

            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
   }

   public void midElement(){
        Node fP = head;
        Node sp = head;

        while (fP.next!=null){
            fP = fP.next.next;
            sp = sp.next;
        }
       System.out.println("middle element is "+sp.data);
   }
   public Node reverse(Node node){
        Node current = head;
        Node pre = null;
        Node nxt = null;

        while (current!=null){
            nxt = current.next;
            current.next = pre;
            pre = current;
            current = nxt;
        }
        node = pre;
        return node;
   }

    public static void main(String[] args) {
        CompleteLinkedListOperations completeLinkedListOperations = new CompleteLinkedListOperations();
        completeLinkedListOperations.insert(2);
        completeLinkedListOperations.insert(5);
        completeLinkedListOperations.insert(9);
        completeLinkedListOperations.insertAtStart(0);
        completeLinkedListOperations.insertAtSpecIndex(1,1);
        //completeLinkedListOperations.deleteAT(1);
        completeLinkedListOperations.midElement();
        completeLinkedListOperations.show();
        head = completeLinkedListOperations.reverse(head);
        System.out.println("reverse linked list is ");
        completeLinkedListOperations.show();
    }

}
