public class freindsPairing {

    public static int pairing(int n){
        if(n==1 || n==2){
            return n;
        }

        int fnm1=pairing(n-1);
        int fnm2=pairing(n-2);

        int pairways=(n-1)*fnm2;

        return fnm1+pairways;
    }
    public static void main(String[] args) {
        int n=3;

        System.out.println(pairing(n));
    }
}
