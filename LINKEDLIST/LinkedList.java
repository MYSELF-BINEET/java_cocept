// package JAVA CONCEPTS.LINKEDLIST;

public class LinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
            return;

        }

        newnode.next = head;
        head = newnode;

    }

    public void addlast(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;

    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;

        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void addmiddle(int data, int idx) {
        Node newnode = new Node(data);

        if (head == null) {
            System.out.println("list is empty  ");
        }

        Node prevnode = head;
        int i = 0;

        while (i < idx - 1) {
            prevnode = prevnode.next;
            i++;

        }

        newnode.next = prevnode.next;
        prevnode.next = newnode;

    }

    public void removefirst() {
        if (head == null) {
            System.out.println("list is empty  ");
            return;
        }

        head = head.next;
    }

    public void removelast() {
        // Node newnode = new Node();

        if (head == null) {
            System.out.println("list is empty ");
            return;
        } else if (size == 1) {
            head = tail = null;
        } else {
            Node prevnode = head;
            while (prevnode.next != null) {
                prevnode = prevnode.next;
            }

            prevnode.next = null;
            tail = prevnode;
        }
    }

    public  void iterativeSearch (int key ){
        int i=0;
        Node temp = head;

        while(temp!=null){
        if(temp.data==key )
        return i;

        }

        temp = temp,next ;
        i++;

    }

    public void reverse() {
        Node curr = head;
        Node prev = null;

        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthnode(int idx) {
        int size = 0;
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
            size++;
        }

        int i = 0;
        if (idx == size) {
            head = head.next;
            return;
        }

        Node prev = head;

        while (i < size - idx) {
            prev = prev.next;
            i++;

        }

        prev.next = prev.next.next;
        return;
    }

    public void findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public boolean checkPalindrome (Node head ){
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        if (head == null || head.next == null){
            return true;

        }

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr = next;
            prev = curr;

        }

        Node left = head;
        Node right = prev;

        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left - left.next;
            right - right.next;



        }

        return true;
    }

    public static boolean isCycle (){   // flouyd cycle alogorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;

            if(slow== fast){
                return true;

            }
        }

        return false;
    }

    public static void removeCycle(){

        // detect cycle
        Node slow  = head;
        Node fast = head;

        boolean isCycle = false;
       while(fast != null && fast.next != next){
        slow = slow.next;
        fast = fast.next.next;

        if(slow== fast){
            isCycle = true;
            break;
        }
       }

       if (isCycle==false){
        System.out.println("No Cycle");
        return;
       }

       // remove cycle 

       slow = head;
       Node prev = null;

       while(slow = fast){
        prev= fast;
        slow= slow.next;
        fast= fast.next;
       }


       prev.next = null;



    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addfirst(20);
        ll.addfirst(10);
        ll.addlast(30);
        ll.addlast(40);

        ll.printlist();

    }
}
