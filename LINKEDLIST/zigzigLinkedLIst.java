public class zigzigLinkedLIst {
    public class Node{
        int data;
        Node next;

        Node (int data){
            this.data= data;
            this.next=null;
        }

        public static void zigzigLL (){
            // fing middle 
            Node slow= head;
            Node fast= head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast= fast.next.next;

            }

            Node mid= slow;

            // reverse the linkedlist

            Node curr =mid.next;
            mid.next = null;
            Node prev = null;
            Node Next;

            while(curr != null){
                Next = curr.next;
                curr.next = prev;
                prev= curr;
                curr = Next;
            }

            // perfotm the operation 

            Node left = head;
            Node right = prev;

            Node nextL , nextR;

            while(left != null && right != null){
                nextL = left.next;
                left.next= right;
                nextR= right.next;
                right.next= nextL;

                left = nextL ;
                right = nextR;
            }
        }

    }
    public static void main(String[] args) {
        
    }
}
