import java.util.*;
import java.util.Stack;

public class stockSpan {

    public static void stckSpan(int arr[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i =1 ;i<arr.length;i++){
            while(! s.isEmpty() && arr[i]>arr[s.peek()] ) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh = s.peek();
                span[i]= i-prevHigh;
            }

            s.push(i);
        }

    }

    public static void printarray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int x = sc.nextInt();
        int arr [] = new int[x];
        for(int i = 0 ; i<x;i++){
            System.out.println("enter the element of the array : ");
            arr[i]= sc.nextInt();
        }

        int span[]= new int[arr.length];

        stckSpan(arr, span);
        printarray(span);
    }
}
