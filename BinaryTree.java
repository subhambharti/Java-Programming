
// 85.	Write a program to implement a binary tree and perform in-order traversal.

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int item) { data = item; }
}

public class BinaryTree {
    TreeNode root;

    void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.inOrder(tree.root);
    }
}
