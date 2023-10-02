
// package JAVA CONCEPTS.GREEDY ALGORITHMS;
import java.util.*;
import java.lang.*;

public class fracktional_knapsack {
    public static double knapsack(int value[], int weight[], int w) {
        if (w == 0) {
            return -1;
        }
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalval = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= value[idx]) {
                finalval = finalval + value[idx];
                capacity = capacity - weight[idx];
            } else {
                finalval = finalval + (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        return finalval;
    }

    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double index = knapsack(value, weight, w);

        System.out.println("the maximum total value is " + index);

    }
}
