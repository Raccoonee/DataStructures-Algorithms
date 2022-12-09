package BinaryTree;

public class Main {
    //Binary Search Tree = A tree data structure, where each node is greater than it's left child,
    //		                         but less than it's right.

    //					   benefit: easy to locate a node when they are in this order

    //					   time complexity: best case  O(log n)
    //									 worst case O(n)

    //					   space complexity: O(n)
    // a non-linear data structure where nodes are organized in a hierarchy

    // a  binary search tree is a tree where each parent only has up to 2 children
    // the root node is greater on the left side branch and lesser of the right side branch

    // tree traversal
    // - In order
    // - Post order
    // - Pre order
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));


        tree.display();

        System.out.println(tree.search(1));

        tree.remove(3);

        tree.display();

        tree.remove(10);


    }

    public static void traverseTree(Node root) {
        traverseTree(root.left);
        System.out.println(root.data);
        traverseTree(root.right);
    }
}
