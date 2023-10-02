// package JAVA CONCEPTS.RECURSION;

public class toThePowerOptimize {

    public static int power(int n,int x){
        if(x==0){
            return 1;
        }

        int halfpow=power(n, x/2);
        int pow=halfpow*halfpow;

        if(x%2!=0){
            pow=n*pow;
        }

        return pow;
    }
    public static void main(String[] args) {
        int n=2;
        int x=4;

        System.out.println(power(n, x));
    }
}
