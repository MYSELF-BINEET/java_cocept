// package JAVA CONCEPTS.STACK;


    class Stack{
        int arr[];
        int cap ;
        int top;
        int size;
        Stack(int c){
            top=-1;
            cap = c;
            arr = new int[cap];
        }

        boolean isEmpty (){
            return size == 0;
        }

        void push (int n){
            if(size == 0 ){
                System.out.println("array is empty ");
            }

            top++;
            arr[top]= n ;
            size++;
        }

        int pop (){
            if(size == 0 ){
                System.out.println("array is empty ");
            }

          int x= arr[top];
          top--;
          return x;
        }

        int peek(){
            if(size== 0){
                System.out.println("array is empty ");
            }

            int x= arr[top];
            return x;
        }

        int size(){
            return top +1;

        }
    }

    public class array_Stack {

    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());


    }
}
