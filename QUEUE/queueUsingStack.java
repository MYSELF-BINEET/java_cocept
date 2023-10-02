import java.util.*;
import java.util.Stack;

class queue {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        if (s1.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public static int remove() {
        if (s1.isEmpty()) {
            System.out.println("queue is empty ");
        }

        return s1.pop();
    }

    public static int peek() {
        if (s1.isEmpty()) {
            System.out.println("queue is empty ");
        }

        int front = s1.peek();

        return front;
    }

}

public class queueUsingStack {
    public static void main(String[] args) {
        queue q = new queue();

        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }
    }
}
