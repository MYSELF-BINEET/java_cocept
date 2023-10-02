// package JAVA CONCEPTS.ARRAYLIST;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;


public class containWater {
    public static int tarpWater(ArrayList<Integer> list){
           int max=0;
           for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i), list.get(j));
                int width=j-i;
                int water=height*width;

               max=Math.max(max, water);

            }
           }
           return max;
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


        // System.out.println(list);
        System.out.println(tarpWater(list));
    }
}
