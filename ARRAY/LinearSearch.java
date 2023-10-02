// package JAVA CONCEPTS.ARRAY;

public class LinearSearch {

    public static int linearindex(int arr[],int key){
        int start=0;
        int last=arr.length-1;

        while(start<=last){
            if(arr[start]==key){
                return start;
            }

            start++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println(linearindex(arr, 5));
    }
}
