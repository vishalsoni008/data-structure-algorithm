package tree.binarytree;

class Node{
    int item;
    Node left;
    Node right;

    Node(int value){
        item = value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree(int value){
        root = new Node(value);
    }
    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);

        System.out.println(binaryTree.root.item);
        System.out.println(binaryTree.root.left.item);
        System.out.println(binaryTree.root.right.item);
    }
}
