import java.util.*;
import java.util.Stack;

public class nextGreatetElement {

    public static void nextGreater(int arr[], int elements[]){
        Stack <Integer> s = new Stack<>();

        for(int i = arr.length-1; i>= 0 ;i--){
            while(! s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                elements[i]=-1;
            }else{
                elements[i]=arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void printarray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int x = sc.nextInt();

        int arr[]= new int [x];

        for(int i = 0 ; i<x;i++){
            System.out.println("enter the element of the array : ");
            arr[i]= sc.nextInt();
        }


        int nGElement[]= new int [arr.length];

        nextGreater(arr,nGElement);

        printarray(nGElement);
    }
}
