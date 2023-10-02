import java.util.*;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree2 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(roor.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);

    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void levelorder (Node root){
           
    }
    public static void main(String[] args) {

    }
}
