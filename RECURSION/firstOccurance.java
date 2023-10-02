// package JAVA CONCEPTS.RECURSION;

public class firstOccurance {

    public static int firstocc(int arr[],int key,int n){
        if(n==arr.length){
            return -1;
        }

        if(key==arr[n]){
            return n;
        }

       return  firstocc(arr, key, n+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};

         System.out.println(firstocc(arr, 3, 0));
    }
    
}
