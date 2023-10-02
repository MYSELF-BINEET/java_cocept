// package JAVA CONCEPTS.RECURSION;

public class TilingProblem {

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        // if(n>m){
        //     return 1;
        // }
        int t1=tiling(n-1);
        int t2=tiling(n-2);

        int totalways=t1+t2;

        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(8));
    }
    
}
