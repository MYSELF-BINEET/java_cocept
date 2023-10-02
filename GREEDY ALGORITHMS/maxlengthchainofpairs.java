// package JAVA CONCEPTS.GREEDY ALGORITHMS;

import java.util.*;
import java.lang.*;

import java.util.Comparator;

public class maxlengthchainofpairs {
    public static int maxchainpairs(int pair[][]) {
        Arrays.sort(pair, Comparator.comparingDouble(a -> a[1]));

        int chainlen = 0;
        int lastend = pair[0][1];

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] >= lastend) {
                chainlen++;
                lastend = pair[i][1];
            }
        }
        return chainlen;

    }

    public static void main(String[] args) {

    }
}
