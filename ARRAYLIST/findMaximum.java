// package JAVA CONCEPTS.ARRAYLIST;
import java.util.*;


public class findMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(108);
        list.add(201);
        list.add(30000);
        list.add(400);
        list.add(100);

        int max=Integer.MIN_VALUE;
        int i=list.size()-1;
        while(i!=0){
            if(max<list.get(i)){
                max=list.get(i);
            }
            i--;
        }


        System.out.println(max);
    }
}
