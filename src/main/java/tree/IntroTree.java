package tree;

public class IntroTree {

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            data = this.data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;

    void insertAtFirst(int data){
        root.left = new Node(data);
    }

    void print(){
        while (root.left != null){
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        IntroTree introTree = new IntroTree();
        introTree.insertAtFirst(5);
        introTree.print();

    }
}
