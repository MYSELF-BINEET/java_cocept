import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class LINKEDLIST_ADD {

    class Node {
        String data;
        Node next;
        Node head;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        // ADD FIRST IN LINKED LIST
        
        public void addfirst(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        // ADD LAST IN LINKED LIST
        public void addlast(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }

            Node currNode = head;

            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        public void printlist() {
            Node currNode = head;
            if (head == null) {
                System.out.println("THIS LIST IS EMPTY BRO.........");
            }
            while (currNode != null) {
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.print("NULL");

        }
    }

    public static void main(String[] args) {
        LINKEDLIST_ADD list = new LINKEDLIST_ADD();

        // ADD LINKED LIST FIRST    

        list.addfirst("WHAT`S");
        list.addfirst("BUDDY.......");
        list.addfirst("HEY...");
        list.addlast("UP");

        list.printlist();

    }

    private void printlist() {                                                               // it is a private printlist function..............
    }

    private void addlast(String string) {                                       // it is a private add last funtion..............
    }

    private void addfirst(String string) {                                 // it s a private add first function..............
    }

}
