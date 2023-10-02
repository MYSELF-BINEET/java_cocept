
// package JAVA CONCEPTS.GREEDY ALGORITHMS;
import java.util.*;
import java.lang.*;

public class INDIAN_COINS {
    public static void indiancoins(Integer coins[], int amount) {
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        int countofcoins = 0;

        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    countofcoins++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }

        System.out.println("total  min coins used " + countofcoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int amount = 590;
        indiancoins(coins, amount);
    }
}
