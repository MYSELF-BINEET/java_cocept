public class doublyLL {

  public  class Node {
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data= data;
            this.next= null;
            this.prev= null;
        }

        public static Node head; 
        public static Node tail;
        public static Node prev;
        
        public static void addfirst(int data ){
            Node newnode = new Node (data);

            if(head == null){
                head = tail = newnode;
            }

            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }

        public static void removelast (){
            if(head == null ){
                System.out.println("list is empty ");
            }

            if(size ==  1){
                head = tail = null;;

            }

        int val = head.data;
        head = head.next ;
        head.prev = null; 
         return val;

      }

      public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev= next;

            prev= curr;
            curr = next;
        }

        head= prev;
      }
    public static void main(String[] args) {
        
    }
    
}
