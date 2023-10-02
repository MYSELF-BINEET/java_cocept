// package JAVA CONCEPTS.GREEDY ALGORITHMS;

import java.lang.*;
import java.util.*;
// import java.Comparator

public class activity_selection {
    public static void activities(int start[], int end[]) {
        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function
        Arrays.sort(activities, Comparator.comparingDouble(a -> a[2]));

        int maxact = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activities[0][0]);
        int lastend = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastend) {
                ans.add(activities[i][0]);
                lastend = activities[i][2];
                maxact++;
            }
        }

        System.out.println("the maximum activities is " + maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A:" + ans.get(i));
        }
    }

    public static void main(String[] args) {
        int strat[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        activities(strat, end);
    }
}
