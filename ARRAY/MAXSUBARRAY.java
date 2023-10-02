import java.util.*;

public class MAXSUBARRAY {

    public static void maxarray(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += arr[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("the maximum of the sunarray is " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, -6, 8, 10 };
        // System.out.println(maxarray(numbers));
        maxarray(numbers);
    }
}
