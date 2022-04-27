package linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(3);
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(6);

        linkedList.insertAtStart(1);
        linkedList.insertAtSpeIndex(2,11);
     //   linkedList.midElement();
        linkedList.show();
    }
}