
// package JAVA CONCEPTS.STACK;
import java.util.*;



    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Stack {

        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
            }

            newNode.next = head;
            head = newNode;

        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("list is empty my friend ");
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("list is empty my friend ");
            }

            int top = head.data;
            return top;

        }
    }

    public class arraylist_Linkedlist {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
