// package JAVA CONCEPTS.ARRAY;

public class BinarySearch {
    public static int binaryindex(int arr[],int key){
        int start =0;
        int last=arr.length-1;

        while(start<=last){
            int mid=start+(last-start)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                last=mid-1;
            }

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println(binaryindex(arr, 5));
    }
}
