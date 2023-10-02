// package JAVA CONCEPTS.ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class pairSum2 {

    public static Boolean check(ArrayList<Integer>list,int target){
        int pivot=Integer.MIN_VALUE;
        int n=list.size();

        for (int i = 0; i < n; i++) {
            if (list.get(i)>list.get(i+1)) {
                pivot=i;
            }
        }

        int lp=pivot+1;
        int rp=pivot;

        while(lp!=rp){
            if (list.get(rp)+list.get(lp)==target) {
                return true;
            }else if (list.get(rp)+list.get(lp)<target) {
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");

        int x=sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("enter the element of the arraylist :");
            int v=sc.nextInt();
            list.add(v);
        }

    }
}
