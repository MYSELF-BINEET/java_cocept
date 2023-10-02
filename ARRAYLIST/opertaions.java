// package JAVA CONCEPTS.ARRAYLIST;
import java.util.*;


public class opertaions {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.remove(2);

        int element=list.get(2);

        list.set(2,20);

        list.add(3,30);

        // System.out.println(element);
        System.out.println(list.size());
        System.out.println(list.contains(20));


        // Collections.reverse(list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);
    }
}
