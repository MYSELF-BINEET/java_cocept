//  package JAVA_CONCEPTS;



public class LINKEDLIST_DELETE {
    class Node {
        String data;
        Node next;
        Node head;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        // DELETE FIRST
        public void deletefirst(String data) {
            
            if (head.next == null) {
                System.out.println("THIS LIST IS EMPTY");
            }
            head = head.next;

        }

        // DELETE LAST 
        public void deletelast(String data){
            if(head== null){
                System.out.println("THIS IS AN EMPTY LIST");
                return;
            }

            if ( head.next== null){
                head= null;
                return;
            }
            Node lastNode = new Node(data);
            Node secondlastNode = new Node(data);

            lastNode = head.next;
            secondlastNode = head;

            while(lastNode.next != null){
                     lastNode = lastNode.next;
                     secondlastNode = secondlastNode.next;

            }
            secondlastNode.next = null;
        }
        
    }
    public static void main(String[] args) {
        LINKEDLIST_ADD list = new LINKEDLIST_ADD();
        
    }
    
}
