import java.util.*;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {
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
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.println(root.data + " ");
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data + " ");
    }

    // public static void levelorder(Node root) {
    // if (root == null) {
    // return;
    // }
    // Queue<Node> q = new LinkedList<>();
    // q.add(root);
    // q.add(null);

    // while (!is.isEmpty()) {
    // Node currNode = q.remove();
    // if (currNode == null) {
    // System.out.println();
    // if (q.isEmpty()) {
    // break;
    // } else {
    // q.add(null);
    // }
    // } else {
    // System.out.println(currNode.data + " ");
    // if (currNode.left != null) {
    // q.add(currNode.left);
    // }
    // if (currNode.right != null) {
    // q.add(currNode.right);
    // }
    // }
    // }
    // }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(! q.isEmpty()){
            Node newNode = q.remove();
            if(newNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(newNode.data+" ");
                if(newNode.left != null){
                    q.add(newNode.left);
                }
                if(newNode.right!=null){
                    q.add(newNode.right);.
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int counts(Node root) {
        if (root == null) {
            return 0;
        }

        int leftcounts = counts(root.left);
        int rightcounts = counts(root.right);

        return leftcounts + rightcounts + 1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum + rightsum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("the root is  of tree :" + root.data);
    }
}