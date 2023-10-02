
// package JAVA CONCEPTS.GREEDY ALGORITHMS;
import java.util.*;

public class min_absolute_difference {
    public static void main(String[] args) {
        int A[] = { 4, 5, 6 };
        int B[] = { 14, 15, 16 };

        Arrays.sort(A);
        Arrays.sort(B);

        int mindiff = 0;

        for (int i = 0; i < A.length; i++) {
            mindiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("min absolute diff of pairs " + mindiff);
    }
}
