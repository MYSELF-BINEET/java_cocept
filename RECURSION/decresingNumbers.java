// package JAVA CONCEPTS.RECURSION;

public class decresingNumbers {

    public static void DecresingNumbers(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        DecresingNumbers(n-1);

    }
    public static void main(String[] args) {
        int n=10;

        DecresingNumbers(n);
    }
}
