// package JAVA CONCEPTS.ARRAY;

public class ReverseArray {

    public static void reverse(int arr[]) {
        int start = 0;
        int last = arr.length - 1;

        while (start <= last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
