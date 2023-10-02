// package JAVA CONCEPTS.STACK;
import java.util.*;

public class stacktoBottom { 

    public static void bottom(Stack <Integer> s , int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(s,data);
        push(s.top);
    }

       public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
        s.push(20);
        s.push(30);

        bottom(s,40);

        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
