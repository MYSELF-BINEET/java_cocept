// package JAVA CONCEPTS.RECURSION;

public class lastOccurance {

    public static int lassOcc(int arr[],int key,int n){
        if(n==arr.length){
            return -1;
        }

        int isFound =lassOcc(arr, key, n+1);

        if(  arr[n]==key){
            return n;
        }


        return isFound;
      

    }
    public static void main(String[] args) {
        int arr[]={1,2,2,22,22,2,2,2};

        System.out.println(lassOcc(arr, 2, 0));


    }
}
