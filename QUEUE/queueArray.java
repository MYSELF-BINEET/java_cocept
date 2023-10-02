import java.util.*;
import java.util.Queue;

static class Queue {
    int arr[];
    int size;
    int rear;
    int front;

    Queue(int capacity){
        this.arr[]=new int[capacity];
        this.size=0;
        this.rear=-1;
        this.front =-1;
    }

    public static boolean isEmpty(){
        if(this.rear =-1 && this.front =-1){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isFulll(){
        if(((rear+1)%size) == front ){
            return true;
        }else{
            retuen false;
        }
    }

    public static void add(int data) {
        if (isFulll()) {
            System.out.println("list is full");
            return;
        } else if (isEmpty()) {
            this.rear++;
            this.front++;
            arr[this.rear] = arr[this.front] = data;
        } else {
            this.rear = (this.rear + 1) % size;
            arr[this.rear] = data;
        }
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("list is empty ");
        }
        int result = arr[this.front];

        if (this.front == this.rear) {
            this.front = this.rear = -1;
        } else {
            this.front = (this.front + 1) % size;
        }

        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("list is empty ");
            return;
        }

        int result = arr[this.front];

        return result;

    }

}

public class queueArray {
    public static void main(String[] args) {

    }
}
