// package JAVA CONCEPTS.RECURSION;

public class arrayIsSorted {

    public static boolean IsSorted(int arr[],int n){
           if(n==arr.length-1){
                return true;
           }

           if(arr[n]>arr[n+1]){
            return false;
           }

            return IsSorted(arr, n+1);
    } 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        System.out.println(IsSorted(arr, 0));
    }
}
