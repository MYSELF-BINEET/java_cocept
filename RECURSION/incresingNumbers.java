// package JAVA CONCEPTS.RECURSION;

public class incresingNumbers {

    public static void IncresingNumbers(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }

        IncresingNumbers(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;

        // System.out.println();
        IncresingNumbers(n);
    }
}
