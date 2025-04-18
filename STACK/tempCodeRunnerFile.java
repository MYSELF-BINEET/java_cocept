import java.util.*;
import java.util.Stack;

public class reverse_Stack {

    public static void pushAtbottom(Stack<Integer> s, int data){

        while(! s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
        
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        reverseStack(s);
        while(! s.isEmpty()){
            System.out.println(s.pop());
            // s.pop();
        }
    }
}
