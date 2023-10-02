// package JAVA CONCEPTS.ARRAYLIST;
import java.util.*;

public class containWater2 {
    public static int tarpWater(ArrayList<Integer> list){
        int max=0;
       int lp=0;
       int rp=list.size()-1;

       while(lp<rp){
        int height=Math.min(list.get(rp), list.get(lp));
        int width=rp-lp;
        int water=height*width;

        max=Math.max(max, water);

        if(list.get(lp)<list.get(rp)){
            lp++;
        }else{
            rp--;
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
