// package JAVA CONCEPTS.ARRAYLIST;
import java.util.*;
public class swap {
    public static void swap(ArrayList<Integer>list,int m,int n){
        int temp=list.get(n);
        list.set(n, list.get(m));
        list.set(m,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(20);
        list.add(101);
        list.add(30);
        list.add(11);
        list.add(99);


        Collections.swap(list,1,3);
        swap(list, 0, 2);
        System.out.println(list);
    }
}
